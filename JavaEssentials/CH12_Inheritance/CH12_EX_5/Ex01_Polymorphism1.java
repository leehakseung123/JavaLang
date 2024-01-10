package CH12_EX_5;

abstract class Calc         // 1. 추상 클래스 정의
{
    int a = 5;
    int b = 6;

    abstract void plus();
}

class MyCalc extends Calc   // 2. 추상 클래스를 상속한 클래스 정의
{
    void plus()
    {
        System.out.println(a + b);
    }

    void minus()
    {
        System.out.println(a - b);
    }
}


public class Ex01_Polymorphism1
{
    public static void main(String[] args)  // 3. 객체를 만드로 객체를 나타내는 클래스형 변수에 참조 값 대입
    {
        MyCalc myCalc1 = new MyCalc();
        myCalc1.plus();
        myCalc1.minus();

        // 4. 하위 클래스 객체를 상위 클래스 객체의 대입
        Calc myCalc2 = new MyCalc();
        myCalc2.plus();
        // 5. 다음 메서드는 설계도에 없다. 사용불가
        // myCalc2.minus();
    }
}
