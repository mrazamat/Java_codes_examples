public class MyExplicitThrow {
    public static void main(String[] args) {
        MyExplicitThrow met = new MyExplicitThrow();
        try {
            System.out.println("length of JUNK is " + met.getStringSize("JUNK"));
            System.out.println("length of Wrong is " + met.getStringSize("Wrong"));
            System.out.println("length of null is " + met.getStringSize(null));
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    private int getStringSize(String str) throws Exception {
        if (str == null) {
            throw new Exception("String input is null");
        }
        return str.length();
    }
}
