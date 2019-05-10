package may.day1;

public class RunnableDemo implements Runnable {
    @Override
    public void run(){
        System.out.println("线程ok");
    }

    public static void main(String[] args) {
        System.out.println("线程开始");
        RunnableDemo demo = new RunnableDemo();
       Thread thread = new Thread(demo);
       thread.start();
        System.out.println("线程结束");
    }
}
