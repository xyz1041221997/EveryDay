package may.day2;

public class BuyPlay2 implements Runnable {
    @Override
    public void run() {
        while (BuyPlayMian.number > 0) {
            synchronized(this) {
                BuyPlayMian.number--;
                System.out.println("Window2 buy play,other:" + BuyPlayMian.number);
            }
        }
    }
}
