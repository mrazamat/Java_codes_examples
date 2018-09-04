public class MyOverloading {
//    Java Constructor Overloading Examples
//    Like method overloading we can overload constructors also.
//    Along with default constructor, we can have constructors with parameters.
//    The no of parameters can be same, and it can have different datatypes.
//    Below example gives sample code for constructors overloading.

    public MyOverloading(){
        System.out.println("Inside default constructor");
    }
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with string value");
    }
    public MyOverloading(int i,int j){
        System.out.println("Inside double parameter constrctor");
    }

    public static void main(String[] args) {
        MyOverloading mco = new MyOverloading();
        MyOverloading smpco = new MyOverloading(10);
        MyOverloading dmpco = new MyOverloading(10,20);
        MyOverloading sdmpco = new MyOverloading("string");

    }
}
