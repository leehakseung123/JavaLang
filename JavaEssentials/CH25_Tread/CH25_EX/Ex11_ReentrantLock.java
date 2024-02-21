package CH25_EX;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount   // 1.
{
    ReentrantLock myLock = new ReentrantLock(); // 2.
    int money = 0;

    public void deposit()
    {
        myLock.lock();      // 3.
        money++;
        myLock.unlock();    // 4.
    }

    public void withdraw()
    {
        myLock.lock();
        money--;
        myLock.unlock();
    }

    public int balance()
    {
        return money;
    }
}
public class Ex11_ReentrantLock {
    public static BankAccount account = new BankAccount();  // 5.

    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {    // 6.
            for (int i=0; i<10000; i++)
            {
                account.deposit();
            }
          // 7.
        };

        Runnable task2 = () -> { // 8.
            for (int i=0; i<10000; i++)
            {
                account.withdraw();
            }
            // 9.

        };

        ExecutorService pool = Executors.newFixedThreadPool(2);     // 10.
        pool.submit(task1);
        pool.submit(task2);
        // 11.

        pool.shutdown();    // 12.
        pool.awaitTermination(100, TimeUnit.SECONDS); //13.

        System.out.println(account.balance());  //14.
    }
}
