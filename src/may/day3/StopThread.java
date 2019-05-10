package may.day3;

public class StopThread {

    public static void main(String[] args) {
        ThreadDemo1 demo1 = new ThreadDemo1();
        Thread t1 = new Thread(new ThreadDemo1());
        t1.start();
        //way2 : 直接使用stop先停止线程  不推荐
//        t1.stop();

//        t1.interrupt();
//

    }
}

/**
 * 停止线程的第一种方法
 * 使用标志符flag
 * 当使用wait方法是线程一直处于等待状态,不会运行到 flag = false中;
 */
class ThreadDemo1 implements Runnable{
    boolean flag = true;
    int  time = 0;
    @Override
    public void run() {
        while(flag){
            try {
                time++;
                System.out.println("我是停止线程的第一种方法!!!!" + time);
//                wait();
//                if (time > 100) {
//                    flag = false;
//                }

            }catch (Exception e){

            }
        }
    }
}