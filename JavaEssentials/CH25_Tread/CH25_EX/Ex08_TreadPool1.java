package CH25_EX;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex08_TreadPool1 {
    public static int money = 0;    // 1. 스태틱 영역에 있는 변수는 모든 스레드에서 값을 공유하여 사용할 수 있다.

    public static void main(String[] args) {
        Runnable task1 = () -> {        // 2. 스레드에 시킬 작업
            for (int i=0; i<10000; i++)     // 3. 10000번 동안 더하기를 한다.
            {
                money++;
            }
        };

        Runnable task2 = () -> {    // 4. 스레드에 시킬 작업, Runnable을 이용하여 task2 스레드를 만든다.
            for (int i=0; i<10000; i++)
            {
                money--;
            }            // 5. 10000번 동안 빼기를 한다.
            String name = Thread.currentThread().getName();;
            System.out.println(name + " : " + money);
        };

        ExecutorService pool = Executors.newSingleThreadExecutor();     //6. 스레드 풀을 만든다. 현재 스레드 풀은 하나의 스레드만 전달받아 처리할 수 있다.
        pool.submit(task1);     // 7. 스레드 풀에 작업을 전달
        pool.submit(task2);    // 8. 스레드 풀에 작업을 전달

        System.out.println("End " + Thread.currentThread().getName());  // 9. main() 스레드명 출력

        pool.shutdown();    // 10. 스레드 풀과 그 안에 있는 스레드의 소멸
    }
}
