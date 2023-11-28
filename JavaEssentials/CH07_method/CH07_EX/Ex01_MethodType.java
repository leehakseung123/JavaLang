package CH07_EX;

public class Ex01_MethodType {
    public static void main(String[] args)  // static이 붙어 있기 때문에 main()메서드에서 호출하는 메서드에는 static이 붙어있다.
    {
        // 매개변수 없고 반환 없는 메서드
        sayHello();

        //매개변수 있고 반환 없는 메서드
        addTwoNum1(5, 2);

        // 매개변수 없고 반환 있는 메서드
        int age = getAge();                 //int age = getAge(); ▶ int age = 20; 순서로 진행
        System.out.println(age);
        System.out.println( getAge());      // System.out.println( getAge()); ▶ System.out.println(20); 순서로 진행

        //매개변수 있고 반환 있는 메서드
        int sum = addTwoNum2(1, 2);
        System.out.println("합은 " + sum);
    }

    public static void sayHello(   )
    {
        System.out.println("Hello");
    }

    public static void addTwoNum1(int num1, int num2)
    {
        int nResult = num1 + num2;
        System.out.println(nResult);
    }

    public static int getAge()
    {
        return 20;
    }

    public static int addTwoNum2(int num1, int num2)
    {
        return num1 + num2;
    }

}
