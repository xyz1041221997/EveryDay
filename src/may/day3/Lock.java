package may.day3;

/**
 *关于synchronized锁关键字的概念 释放锁的条件
 * 1.同步方法正常结束代码时
 * 2.发生异常时
 * 3.方法中出现break,和return
 * 4.程序中使用的wait方法
 */
public class Lock {
   static   String resource1 = "我是资源1";
   static   String resource2 = "i am resource two";

    public static void main(String[] args) {
      Thread t1 = new Thread(new ThreadOne());
      Thread t2 = new Thread(new ThreadTwo());
      t1.start();
      t2.start();
    }
}
class ThreadOne implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Lock.resource1) {
                    System.out.println(Thread.currentThread().getId() + "已经获取的资源1");
                    Thread.sleep(1000);
                    synchronized (Lock.resource2) {
                        System.out.println(Thread.currentThread().getId() + "获取了资源2");
                    }
                }

            }
        }catch(Exception e){

        }

    }
}
class ThreadTwo implements Runnable{
    @Override
    public void run() {
        try {
            synchronized (Lock.resource2) {
                System.out.println("线程2获取了资源2");
                Thread.sleep(1000);
                synchronized (Lock.resource1) {
                    System.out.println("线程2获取了资源1");
                }
            }
        }catch(Exception e){

        }

    }
}