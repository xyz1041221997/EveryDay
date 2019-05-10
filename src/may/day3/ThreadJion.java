package may.day3;

/**
 * join() 線程先執行完再執行完其他線程
 */
public class ThreadJion {
    public static void main(String[] args) {
        try{
            Thread t1 = new Thread(new Threadone());
            Thread t2 = new Thread(new Threadtwo());
            t1.start();
            t1.join();
            t2.start();
        }catch (Exception e){

        }

    }
}
class Threadone implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println("獻策一" + i);
        }
    }
}
class Threadtwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i < 20;i++){
            System.out.println("線程二" + i);
        }

    }
}