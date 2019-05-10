package may.day2;

public class BuyPlay1 implements Runnable{
    @Override
    public void run() {

         while(BuyPlayMian.number > 0){
             synchronized (this){
                 BuyPlayMian.number--;
                 System.out.println("窗口一卖票了,剩余:" + BuyPlayMian.number);
             }
        }

    }
}
