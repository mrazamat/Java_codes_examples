package uz.coder.constructor;
//Java Constructor Overloading Examples

public class MyOverloading {
    private MyOverloading(){
        System.out.println("Inside default constructor");
    }
    private MyOverloading(int i){
        System.out.println("Inside single parameter with int value");
    }
    private MyOverloading(String str){
        System.out.println("Inside single parameter constructor with single String object");
    }
    private MyOverloading (int i, int j){
        System.out.println("With two int parameter");
    }

    public static void main(String[] args) {
        MyOverloading mo = new MyOverloading();
        MyOverloading mo1 = new MyOverloading(1);
        MyOverloading mo2 = new MyOverloading("Coder.uz");
        MyOverloading mo3 = new MyOverloading(1,2);
    }
}
