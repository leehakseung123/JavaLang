package CH25_EX;

class MyThread3 implements Runnable     // 1. 인터페이스를 구현한 클래스를 만든다.
{
    public void run()       // 2. 스레드를 실행하면 해당 스레드에서 이 run() 메서드를 호출한다.
    {
        int sum = 0;
        for (int i=0; i<10; i++)
        {
            sum += i;
        }
        String name = Thread.currentThread().getName();
        // 3. 현재 스레드명을 가져온다. 스레드를 생성할 때 이름을 지정하지 않았기 때문에 일련번호가 붙여진 이름이 반환된다.
        System.out.println(name + " : " + sum);     // 4. 스레드명과 연산 결과를 출력한다.
    }
}
public class Ex03_RunnableInterface1 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread3());
        // 5. 스레드 객체를 생성, 이 때 기본 Thread 클래스를 이용하여 생성하는데, 생성자 인수로 우리가 만든 클래스의 객체를 넘겨준다.
        // 이 부분이 Thread클래스를 상속한 클래스와 Runnable 인터페이스를 구현한 클래스에서 달라지는 부분이다.
        t.start();                              // 6. 스레드의 run()메서드를 바로 호출하지 않고 start()메서드를 호출하면 run()메서드가 실행된다.

        System.out.println("main : " + Thread.currentThread().getName());
        // 7. main()도 스레드이다. 현재 스레드명을 가져와서 출력한다.
    }
}
