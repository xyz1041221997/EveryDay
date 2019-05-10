package may.day2;

/**
 * 共有100张票,窗口一和窗口二一起买票,卖完截止
 *
 */
public class BuyPlayMian {
    static int number = 1000;
    public static void main(String[] args) {
      Thread t1 = new Thread(new BuyPlay1());
      Thread t2 = new Thread(new BuyPlay2());
      t1.start();
      t2.start();
    }
}
