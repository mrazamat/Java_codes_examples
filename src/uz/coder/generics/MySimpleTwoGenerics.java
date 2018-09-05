package uz.coder.generics;

public class MySimpleTwoGenerics {
    /*
    Below example shows how to create a simple generics class with two type parameters.
    Look at the class definition, we defined two types of parameters called U & V, seperated by ",".
    You can define multiple type parameters seperated by ",".
    Look at sample code for more comments.
     */
    public static void main(String[] args) {
        SimpleGen<Integer, String> group = new SimpleGen<>(140, "Java developers");
        group.printTypes();
        System.out.println(group);
        System.out.println("Group number: " + group.getObjV() + " group name: " + group.getObjV());
    }
}

class SimpleGen<U, V> {
    private U objU;
    private V objV;

    public SimpleGen(U objU, V objV) {
        this.objU = objU;
        this.objV = objV;
    }

    public U getObjU() {
        return objU;
    }

    public V getObjV() {
        return objV;
    }


    public void printTypes() {
        System.out.println("U type: " + this.objU.getClass().getName());
        System.out.println("V type: " + this.objV.getClass().getName());
    }

    @Override
    public String toString() {
        return "SimpleGen{" +
                "objU=" + objU +
                ", objV=" + objV +
                '}';
    }
}