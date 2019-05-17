package may.day6;

/**
 * volatile的作用
 * 1. 可见性 :对其他线程 资源是可见的
 * synchronized : 原子性 , 一致性
 * 是线程安远
 *
 */
public class VolatileDemo {
    public static void main(String[] args) {
        try {
            Thread0513 thread = new Thread0513();
            thread.start();
            Thread.sleep(300);
            thread.isFlag(false);
        }catch (Exception e){

        }

    }
}
class  Thread0513 extends Thread{
    volatile boolean  flag = true;
    @Override
    public void run() {
        super.run();
        System.out.println("线程开始啦,........");
        while(flag){

        }
        System.out.println("线程结束啦.........");
    }
    public void isFlag(boolean flag){
        this.flag = flag;
    }
}