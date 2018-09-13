package uz.coder.nestedClasses;

public class MyStaticMemberInterfaceTest {
    public void implementMe() {
        System.out.println("Hey I have implemented succesfully!!!");
    }

    public static void main(String[] args) {
        MyStaticMemberInterfaceTest msi = new MyStaticMemberInterfaceTest();
        msi.implementMe();
    }
}

class MyStaticMemeberInterface {
    public static interface MyStaticInterface {
        public void implementMe();
    }
}
