package may.day1;

public class InnerClass {
    public static void main(String[] args) {
        System.out.println("启动结束");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类!!!");
            }
        }).start();
        System.out.println("启动线程");
    }
}
