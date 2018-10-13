package uz.coder.constructor;

public class MyParameterizedConstructor {
    private String name;

    private MyParameterizedConstructor(String name) {
        this.name = name;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parametr is: " + name);
    }

    public static void main(String[] args) {
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("coder");
    }
}
