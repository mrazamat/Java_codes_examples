public class RunMyThread {
    public static void main(String[] args) {
        System.out.println("Starting main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while (MyRunnableThread.myCount<=10){
            try{
                System.out.println("Main Thread: " + (++MyRunnableThread.myCount));
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Exception in main thread: " + e.getMessage());
            }
        }
        System.out.println("End of Main Thread");
    }
}
