package uz.coder.patterns;

public class Pattern_1 {
    private static int count = 5;

    public static void main(String[] args) {
        for (int i = 0; i <= count; i++) {
            for (int j = 0; j <=count; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
