package CH22_EX;

class Outer1
{
    private int speed = 10;

    class MemberInner1  // 1.외부 클래스 내부에 클래스를 선언, 멤버 메서드처럼 외부 클래스의 자원을 그대로 사용할 수 있다,
    {
        //외부 클래스의 자원 (speed) 사용 가능
        public void move()
        {
            System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);        // 2. 내부 클래스에서 외부 클래스의 멤버 변수를 사용
        }
    }

    public void getMarine()
    {
        MemberInner1 inner = new MemberInner1();        // 3.Outer1 클래스의 객체를 만든다.
        inner.move();
    }
}
public class Ex01_MemberInner {
    public static void main(String[] args) {
        Outer1 out = new Outer1();      // 4.Outer1 클래스의 객체를 만든다.

        // out 기반으로 생성된 객체의 메서드 호출
        out.getMarine();

        // out 기반으로 내부 클래스 객체 생성
        Outer1.MemberInner1 inner = out.new MemberInner1();     // 5. 내부 클래스는 외부 클래스를 이용해 객체를 먼저 만들고 그 객체를 참조하여야만 만들 수 있다.

        // inner 기반으로 생성된 객체의 메서드 호출
        inner.move();
    }
}
