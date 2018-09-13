// Program: How to initialise non-static member (local class) class?
//
//Description:
//You can create an instance for non-static member class by creating
//instance for top level class.

package uz.coder.nestedClasses;

public class MyNonStaticMemberClassInstance {
    public static void main(String[] args) {
        ParrentClass pc = new ParrentClass();
        ParrentClass.ChildClass cc = pc.getInnerInstance();
        cc.myMethod();
        ParrentClass.ChildClass cc1 = pc.new ChildClass();
        cc1.myMethod();
    }
}

class ParrentClass {
    public class ChildClass {
        public void myMethod() {
            System.out.println("Hey you have called me!!!");
        }
    }

    public ChildClass getInnerInstance() {
        return this.new ChildClass();
    }
}