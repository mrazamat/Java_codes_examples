public class MyRunnableThread implements Runnable {

    public static int myCount = 0;
    public MyRunnableThread(){

    }

    @Override
    public void run() {
        while(MyRunnableThread.myCount<=10){
            try{
                System.out.println("Expl Thread: " + (++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Exception in thread: " + e.getMessage());
            }
        }
    }


}
