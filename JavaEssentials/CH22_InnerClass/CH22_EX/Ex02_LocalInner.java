package CH22_EX;

class HumanCamp2
{
    private int speed = 10;

    public void getMarine()
    {
        class Marine2   // 1.외부 클래스 메서드 안의 정의된 내부 클래스는 지역 변수와 유사한 특성을 가진다.
        {
            // 외부 클래스의 자원 (speed) 사용 가능
            public void move()
            {
                System.out.printf("인가형 유닛이 %d 속도로 이동합니다.\n", speed);
                // 2. 내부 클래스이므로 역시 외부 클래스의 자원을 사용할 수 있다.
            }
        }

        Marine2 inner = new Marine2();      // 3. 해당 메서드 안에서만 생성 가능, 객체의 생성 제한 가능
        inner.move();
    }
}
public class Ex02_LocalInner {
    public static void main(String[] args) {
        HumanCamp2 hc = new HumanCamp2();
        hc.getMarine();
    }
}
