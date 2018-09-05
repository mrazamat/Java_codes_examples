public class MySimpleGenerics {
    // Write a simple generics class example
    public static void main(String[] args) {
        SimpleGenerics<String> sgs = new SimpleGenerics<>("Java the best language!");
        sgs.printType();

        SimpleGenerics<Boolean> sgb = new SimpleGenerics<Boolean>(Boolean.TRUE);
        sgb.printType();
        System.out.println(sgb.getObjReff());
    }

}

class SimpleGenerics<T> {
    private T objReff = null;

    public SimpleGenerics(T param) {
        this.objReff = param;
    }

    public T getObjReff() {
        return this.objReff;
    }

    public void printType() {
        System.out.println("Type: " + objReff.getClass().getName());
    }
}
