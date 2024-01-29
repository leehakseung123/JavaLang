package CH22_EX;

interface Unit3
{
    void move();
}

class HumanCamp3
{
    private int speed = 10;

    public Unit3 getMarine()
    {
        class Marine3 implements Unit3
        {
            public void move()
            {
                System.out.printf("인간형 유닛이 %d의 속도로 이동한다.\n", speed);
            }
        }

        return new Marine3();   // 1. 내부 클래스 사용
    }
}
public class Ex03_AnnonymousInner1 {
    public static void main(String[] args) {
        HumanCamp3 hc = new HumanCamp3();
        Unit3 unit = hc.getMarine();
        unit.move();
    }
}
