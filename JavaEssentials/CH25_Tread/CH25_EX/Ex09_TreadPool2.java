package CH25_EX;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex09_TreadPool2 {
    public static void main(String[] args) {
        Runnable task1 = () -> {   // 1.
            String name = Thread.currentThread().getName();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            System.out.println(name + " :  바로 실행 ");    // 5.
        };

        Runnable task2 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": 바로실행");        // 5.
        };

        Runnable task3 = () -> {        // 6.
            String name = Thread.currentThread().getName();
            try {
                Thread.sleep(2000); // 7.
            }
            catch (Exception e) {}
            System.out.println(name + " : 2초 후 실행");        // 8.
        };

        //스레드 풀에서 수행될 수 있는 스레드의 총량 제한
        ExecutorService pool = Executors.newFixedThreadPool(2); // 9.
        pool.submit(task1);
        pool.submit(task2);
        pool.submit(task3);
        // 10.

        pool.shutdown();    // 11.
    }
}
