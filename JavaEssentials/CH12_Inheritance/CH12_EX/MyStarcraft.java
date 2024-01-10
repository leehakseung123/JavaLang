package CH12_EX;

abstract class Unit     // 부모 클래스
{
    abstract  void doMove();     // 1.추상 클래스
}

class Marine extends Unit       // 자식 클래스
{
    void doMove()           //2. 추상 클래스 구현, doMove 메서드의 구체적인 기능 구현
    {
        System.out.println("마린은 두 발로 이동합니다.");
    }
}

class Zergling extends Unit // 자식클래스
{
    void doMove()       // 3. 추상 클래스 구현, doMove 메서드의 구체적인 기능 구현
    {
        System.out.println("저글링 네 발로 이동합니다.");
    }
}
public class MyStarcraft
{
    public static void main(String[] args) {
        Marine unit1 = new Marine();            // 4. 객체를 생성하고
        unit1.doMove();                         // 5. 객체의 메서드 호출

        Zergling unit2 = new Zergling();        // 6. 객체를 생성하고
        unit2.doMove();                         // 7. 객체의 메서드 호출
    }
}
