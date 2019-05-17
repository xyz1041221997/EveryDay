package may.day7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ThreadPool1 {


    public static void main(String[] args) {
      ExecutorService pool = Executors.newCachedThreadPool();
      for (int i = 0;i < 10;i++){
          int index = i;
          pool.execute(new Runnable() {
              @Override
              public void run() {
                  System.out.println("线程池+" + index);
              }
          });
      }

    }
}
