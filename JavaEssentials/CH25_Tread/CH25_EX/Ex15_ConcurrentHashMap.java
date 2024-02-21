package CH25_EX;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex15_ConcurrentHashMap {
    public static Map<String, Integer> syncMap = null;      // 1.
    public static Map<String, Integer> concMap = null;      // 2.

    public static void performanceTest(final Map<String, Integer> target) throws InterruptedException
    {
        System.out.println("Start : " + Thread.currentThread().getName());
        Instant start = Instant.now();

        Runnable task = () -> {     // 3.
            for (int i=0; i<10000; i++)
            {
                target.put(String.valueOf(i), i);
            }   // 4.
        };

        ExecutorService pool = Executors.newFixedThreadPool(5);     // 5.
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        pool.submit(task);
        // 6.

        pool.shutdown();    // 7.
        pool.awaitTermination(100, TimeUnit.SECONDS);
        // 8.

        Instant end = Instant.now();
        System.out.println("End : " + Duration.between(start, end).toMillis());
        // 9.
    }

    public static void main(String[] args) throws InterruptedException {
        syncMap = Collections.synchronizedMap(new HashMap<>()); // 10.
        performanceTest(syncMap);   // 11.

        concMap = new ConcurrentHashMap<>();    // 12.
        performanceTest(concMap);
        // 13.
    }
}
