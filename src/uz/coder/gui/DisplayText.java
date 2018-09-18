//
// How to display text in different fonts?
//
//        Solution
//        Following example demonstrates how to display text in different fonts using setFont() method of Font class.
package uz.coder.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayText extends JPanel {
    String[] type = {"Serif", "SanSerif"};
    int[] styles = {Font.PLAIN, Font.ITALIC, Font.BOLD, Font.ITALIC + Font.BOLD};
    String[] stylenames = {"Plain", "Italic", "Bold", "Bold & Italic"};

    public void paint(Graphics g) {
        for (int f = 0; f < type.length; f++) {
            for (int i = 0; i < styles.length; i++) {
                Font font = new Font(type[f], styles[i], 18);
                g.setFont(font);
                String name = type[f] + " " + stylenames[i];
                g.drawString(name, 20, (f * 4 + i + 1) * 20);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setContentPane(new DisplayText());
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
