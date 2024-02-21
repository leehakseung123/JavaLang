package CH25_EX;

public class Ex05_MultiThread {
    public static void main(String[] args) {
        Runnable task1 = () -> {        // 1. t1 스레드는 1초 간격으로 짝수를 0부터 20미만까지 출력한다.
            try
            {
                for(int i=0; i<20; i+=2)    // 20 미만 짝수 출력
                {
                    System.out.println(i + " ");
                    Thread.sleep(1000);     // 1000밀리세컨드(1초) 쉼
                }
            }
            catch (InterruptedException e) {}
        };

        Runnable task2 = () ->  {   // 2.t2스레드는 0.5초 간격으로 수를 9부터 1까지 역순으로 출력한다.
            // t1 스레드의 내용이 다 출력되고 그 후에 t2스레드의 내용이 출력되는 것이 아니고,
            // 두 스레드를 거의 동시에 실행시켰기 때문에 두 스레드의 결과가 섞여서 출력된다.
            try
            {
                for (int i=9; i>0; i--)     // 10 미만 수 출력
                {
                    System.out.print("(" + i + ")");
                    Thread.sleep(500);     // 500밀리세컨드 쉼
                }
            }
            catch (InterruptedException e)  {}
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
