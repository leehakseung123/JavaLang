package CH25_EX;

class MyThread2 extends Thread  // 1. 스레드를 상속한 클래스를 만든다.
{
    public void run()
    // 2. 우리가 만든 프로그램을 JVM이 실행시킬 때는 main을 호출하지만, 스레드를 실행하면 해당 스레드에서 이 run() 메서드를 호출한다.
    {
        int sum = 0;
        for (int i=0; i<10; i++)
        {
            sum += i;
        }
        String name = Thread.currentThread().getName();
        // 3. 현재 스레드명을 가져온다. 스레드를 생성할 때 이름을 지정하지 않았기 때문에 일련번호가 붙여진 이름이 반환된다.
        System.out.println(name + ":" + sum);       // 4. 스레드명과 연산결과를 출력한다.
    }
}
public class Ex02_ThreadClass {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();      // 5. 스레드 객체를 생성한다
        t.start();                          // 6.스레드의run() 메서드 이름을 바로 호출하지 않고 start()메서드를 호출해야  run()메서드가 실행된다.
        System.out.println("main : " + Thread.currentThread().getName());
        // 7. main()도 스레드이다. 현재 스레드명을 가져와서 출력한다.
    }
}
