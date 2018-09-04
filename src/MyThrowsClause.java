public class MyThrowsClause {
    public static void main(String[] args) {
        MyThrowsClause mytc = new MyThrowsClause();
        try{
            for (int i = 0; i <5 ; i++) {
                mytc.getJunk();
                System.out.println(i);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void getJunk() throws InterruptedException{
        Thread.sleep(3000);
    }
}
