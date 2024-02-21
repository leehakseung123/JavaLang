package CH25_EX;

public class Ex07_SynMethod {
    public static int money = 0;        // 1. 스태틱 영역에 있는 변수는 모든 스레드에서 값을 공유하며 사용할 수 있다.

    public synchronized static void deposit()   // 2. 동기화 키워드를 이용하여 deposit() 메서드를 정의한다.
    {
        money++;
    }

    public synchronized static void withdraw() // 3. 동기화 키워드를 이용하여 withdraw() 메서드를 정의한다.
    {
        money--;
    }

    public static void main(String[] args) throws InterruptedException  {
        // 4. InterruptedException 예외가 발생하면 예외를 넘기고 종료한다.
        Runnable task1 = () -> { // 5.Runnable을 이용하여 task1 스레드를 만든다.
            for (int i=0; i<10000; i++)
            {
                deposit();      // 6. 공유 변수를 사용하는 메서드를 호출한다.
            }
        };

        Runnable task2 = () -> {        // 7. Runnable을 이용하여 task2 스레드를 만든다.
            for (int i=0; i<10000; i++)
            {
                withdraw();         // 8. 공유 변수를 사용하는 메서드를 호출한다.
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        // 9. 스레드를 만들고

        t1.start();
        t2.start();
        // 10. 실행

        t1.join();  // 11. t1이 참조하는 스레드의 종료를 기다림
        t2.join();  // 12. t2이 참조하는 스레드의 종료를 기다림
        // 스레드가 종료될 떄까지 main()스레드의 진행을 대기시킵니다. t1, t2 스레드가 종료되면

        // 13. 스레드가 종료되면 출력을 진행함. 위  join의 영향, 실행
        System.out.println(money);
    }
}
