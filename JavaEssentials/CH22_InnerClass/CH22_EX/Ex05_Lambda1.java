package CH22_EX;

interface Unit5
{
    void move(String s);
}

class Human5 implements Unit5
{
    public void move(String s)
    {
        System.out.println(s);
    }
    // 1. 원하는 기능
}
public class Ex05_Lambda1 {
    public static void main(String[] args) {
        Unit5 unit = new Human5();      // 2. 자식 객체를 만들고 부모 클래스형 변수에 대입해 줄 수있다.
        unit.move("named : Unit 5");    // 3. 참조 변수를 통해서 메서드를 호출하고 있다.
    }
}
