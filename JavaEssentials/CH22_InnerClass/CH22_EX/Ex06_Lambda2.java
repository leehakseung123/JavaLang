package CH22_EX;

interface Unit6
{
    void move(String s);
}
public class Ex06_Lambda2 {
    public static void main(String[] args) {
        Unit6 unit = new Unit6() {      // 익명 클래스
            public void move(String s) {
                System.out.println(s);
            }
        };  // 1.
        unit.move("annoymous : Unit 6");
    }
}
