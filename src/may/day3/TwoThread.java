package may.day3;

/**
 * 通过Thread中的setDaemon设置线程为守护线程,
 * 即主线程挂载了 该线程也会挂载
 */
public class TwoThread {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadSon());
        t.setDaemon(true);
        t.start();
        for(int i = 0 ;i < 100;i++){
            System.out.println("我是主线程" + i);
        }
    }
}
class ThreadSon implements Runnable{
    @Override
    public void run() {

        for (int i = 0;i < 200;i ++){
            System.out.println("我是子线程!!!" + i);
        }
    }
}