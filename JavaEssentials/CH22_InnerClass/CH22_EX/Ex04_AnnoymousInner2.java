package CH22_EX;

interface Unit4
{
    void move();
}

class HumanCamp4
{
    private int speed = 10;

    public Unit4 getMarine()
    {
/*        class Marine4 implements Unit4
        {
            public void move()
            {
                System.out.println("인간형 유닛이 %d 속도로 이동한다. \n", speed);
            }
        }       // 1.
        return new Marine4();       // 2.  */

        // 이름이 없으므로 부모 클래스나 인터페이스 이름을 사용
        return new Unit4()      // 3.
        {
            public void move()
            {
                System.out.printf("인가형 유닛이 %d 속도로 이동한다.\n", speed);
            }   // 4.
        };      // 하나의 실행문이므로 세미콜론으로 끝난다.
    }
}
public class Ex04_AnnoymousInner2 {
    public static void main(String[] args) {
        HumanCamp4 hc = new HumanCamp4();
        Unit4 unit = hc.getMarine();
        unit.move();
    }
}
