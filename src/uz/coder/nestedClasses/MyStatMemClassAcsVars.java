//How to access top level class variables from static member classes?
package uz.coder.nestedClasses;

public class MyStatMemClassAcsVars {
    public static String staticVar = "You can access me!!!";
    private String privVar = "You cannot access me";

    public static class ChildClass{
        public void myMethod(){
            System.out.println(staticVar);
        }
    }

    public static void main(String[] args) {
        MyStatMemClassAcsVars.ChildClass cc = new MyStatMemClassAcsVars.ChildClass();
        cc.myMethod();
    }
}
