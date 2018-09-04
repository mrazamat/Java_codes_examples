public class MySingleTon {
    private static MySingleTon myObj;

    private MySingleTon() {

    }

    public static MySingleTon getInstance() {
        if (myObj == null)
            myObj = new MySingleTon();
        return myObj;
    }

    public void getSomeThing() {
        System.out.println("I am here....");
    }

    public static void main(String[] args) {
        MySingleTon st = MySingleTon.getInstance();
        st.getSomeThing();
    }
}
