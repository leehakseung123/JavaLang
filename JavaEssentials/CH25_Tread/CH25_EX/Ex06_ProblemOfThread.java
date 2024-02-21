package CH25_EX;

public class Ex06_ProblemOfThread {
    public static int money = 0; //1. 스태틱 영역에 있는 변수는 모든 스레드에서 값을 공유하여 사용할 수 있다.
    public static void main(String[] args) throws InterruptedException {
        // 2.InterruptedException예외가 발생하면 예외를 넘기고 종료한다.
        Runnable task1 = () -> {    //3. Runnable응 이용하여 task1 스레드를 만든다.
            for(int i=0; i<10000; i++)
            {
                money++;
            }
            // 4. 10000번 동안 더하기를 한다.
        };

        Runnable task2 = () -> {    // 5. Runnable을 이용하여 task1스레드를 만든다.
            for(int i=0; i<10000; i++)
            {
                money--;
            }
            // 6.10000번동안 빼기를 한다.
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        // 7.

        t1.start();
        t2.start();
        // 8. 실행

        t1.join();  // 9. t1이 참조하는 스레드의 종료를 기다림
        t2.join();  // 10. t2이 참조하는 스레드의 종료를 기다림

        // 11. 스레드가 종료되면 출력을 진행함. 위 join의 영향
        System.out.println(money);
    }
}
