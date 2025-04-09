package CH12_EX_5;

abstract class Animal {
    abstract void doMove();
}
class Tiger extends Animal {
    @Override
    void doMove() {

        System.out.println("호랑이는 산을 달립니다.");
    }
}

class Lion extends Animal
{
    @Override
    void doMove()
    {
        System.out.println("사자는 평원을 달립니다.");
    }
}
public class Ex04_Polymorphism3
{
    public static void animalChoose(Animal obj)     // 1. 매개변수로 어떤 형태의 객체를 참조하는 변수가 들어올지 알 수 없기 때문데 상위 클래스로 지정해둔다.
            // 하위 클래스를 매개변수로 넘겨도 자동으로 형변환되서 매개변수로 들어오게 된다.
    {
        if (obj instanceof Tiger)
        {
            Tiger tiger = (Tiger) obj;              // 2.원래의 형태로 다시 형변환해서 사용
            tiger.doMove();
        } else {
            Lion lion = (Lion) obj;                 // 3.원래의 형태로 다시 형변환해서 사용
            lion.doMove();
        }
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        animalChoose(tiger);

        Lion lion = new Lion();
        animalChoose(lion);
    }

}
