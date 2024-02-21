package CH25_EX;

public class Ex04_RunnableInterface2 {
    public static void main(String[] args) {
        Runnable task = () -> {     // 1. Runnable 변수로 만들고 람다식을 대입해준다.
            try
            {
                Thread.sleep(3000);     // 2. 스레드의 실행이 3초동안 일지 정지했다가 다시 진행된다.
            }
            catch (Exception e) {}

            int sum = 0;
            for (int i=0; i<10; i++)
            {
                sum += i;
            }
            String name = Thread.currentThread().getName(); // 3. 현재 스레드명을 가져온다,
            // 스레드를 생성할 때 이름을 지정하지 않았기 때문에 일련번호가 붙여진 이름이 반환된다.
            System.out.println(name + " : " + sum );        // 4. 스레드명과 연산 결과를 출력한다.
        };

        Thread t = new Thread(task);    // 5. 스레드 객체를 생성한다.
        // 이때 Runnable 인터페이스를 구현한 스레드는 기본 Thread 클래스를 이용하여 생성하는데, 생성자의 인수로 람다식을 대입한 변수로 넘겨준다.
        t.start();                      // 6. 스레드의 run()메서드를 호출하지 않고 start() 메서드를 호출하면 run()메서드가 실행된다.

        System.out.println("main : " + Thread.currentThread().getName());
        // 7. 내용이 실행과 거의 동시에 출력되고, 3초 후에 4.내용이 출력된다.
    }
}
