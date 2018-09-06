package uz.coder.collections;

import java.util.Enumeration;
import java.util.Vector;
    /*
    Description:
    A class that implements Enumeration interface provides access to series of elements one at a time.
    You need to call nextElement method to get next element in the series.
    Also hasMoreElements() method gives you status about the availability of next element in the series.
     */
public class MyEnumeration {
    public static void main(String[] args) {
        Vector<String> lang = new Vector<>();
        Enumeration<String> en;
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("EJB");
        lang.add("SERVLET");
        lang.add("PHP");
        lang.add("PERL");
        en = lang.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
