package uz.coder.Thread;

public class MyExample implements Runnable {


    @Override
    public void run() {
        System.out.println("Привет из побочного потока");
    }

}

class Program {
    static MyExample myExample;

    public static void main(String[] args) {
        myExample = new MyExample();
        Thread myThready = new Thread(myExample);
        myThready.start();

        System.out.println("Главный поток завершён...");
    }
}

