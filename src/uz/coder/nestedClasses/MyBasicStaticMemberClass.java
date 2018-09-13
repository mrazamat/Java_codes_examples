//  Program: How to initialise or call a static member class?
//        Description:
//        A static member class must me declared as a static member of top level class.
//        Static member class can not have its name as top level class.
package uz.coder.nestedClasses;

public class MyBasicStaticMemberClass {
    public static class MyStaticMemberExampleClass {
        public void printStatus() {
            System.out.println("Hey I am inside static member class");
        }
    }

    public static void main(String[] args) {
        StaticMemberTestClass smt = new StaticMemberTestClass();
        smt.testMemberClass();
    }
}

class StaticMemberTestClass {
    public void testMemberClass() {
        MyBasicStaticMemberClass.MyStaticMemberExampleClass msme
                = new MyBasicStaticMemberClass.MyStaticMemberExampleClass();
        msme.printStatus();
    }
}