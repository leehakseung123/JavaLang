package CH25_EX;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex12_SyncArrayList1 {
    public static List<Integer> list = new ArrayList<>();   //1.
    public static void main(String[] args) throws  InterruptedException {
        for (int i=0; i<10; i++)
        {
            list.add(i);
        }   // 2.
        System.out.println(list);   // 3.

        Runnable task = () -> {     // 4.
            ListIterator<Integer> itr = list.listIterator();    // 5.

            while (itr.hasNext())
            {
                itr.set(itr.next() + 1);        // 6.
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(5);  //7.
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        // 8.

        pool.shutdown();    // 9.
        pool.awaitTermination(100, TimeUnit.SECONDS);   // 10.

        System.out.println(list);   // 11.
    }
}
