package may.day1;

public class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        System.out.println("hello world"+getId()+" " + getName());
        super.run();
    }

    public static void main(String[] args) {
        System.out.println("创建线程开始");
        ThreadDemo1 t = new ThreadDemo1();
        //使用start方法调用线程方法
        t.start();
        Thread.currentThread().getId();
        System.out.println("创建线程结束");
    }
}
