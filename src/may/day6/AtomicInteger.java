package may.day6;

public class AtomicInteger {
    public static void main(String[] args) {
        Thread051302 thread = new Thread051302();
        thread.start();
    }
}
class Thread051302 extends Thread{
    private static volatile  int number = 0;
    @Override
    public void run() {
        super.run();
        for(int i = 0;i < 10000;i++){
            System.out.println(number++);
        }
    }
}