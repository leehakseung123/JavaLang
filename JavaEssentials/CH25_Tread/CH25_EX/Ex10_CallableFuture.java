package CH25_EX;

import java.util.Calendar;
import java.util.concurrent.*;

public class Ex10_CallableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> task1 = () -> {   // 1.
            Thread.sleep(2000);
            return 2 + 3;       // 2.
        };

        Callable<Integer> task2 = () -> {   // 3.
            Thread.sleep(10);
            return 2 * 3;       // 4.
        };

        ExecutorService pool = Executors.newFixedThreadPool(2);     // 5.
        Future<Integer> future1 = pool.submit(task1);
        Future<Integer> future2 = pool.submit(task2);
        // 6.

        System.out.println("이 내용이 먼저 출력됩니다.");

        Integer r1 = future1.get();
        System.out.println("result : " + r1);

        Integer r2 = future2.get();
        System.out.println("result : " + r2);
        //7.

        pool.shutdown();
    }
}
