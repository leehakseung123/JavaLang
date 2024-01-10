package CH12_EX;

class Unit      // 1. 부모 클래스, 먼저 Unit 클래스 정의
{
    String name;
    int hp;

    void doMove()
    {
        System.out.println("이동속도 10으로 이동");
    }
    void printUnit()
    {
        System.out.println("이름 : " + name);
        System.out.println("HP : " + hp);
    }
}

class Marine extends Unit       // 2. 자식 클래스, Unit을 상속하여 Marine 클래스로 정의한다.
    // 상속을 통해 부모 클래스의 멤버를 그대로 계승했기 때문에  Marine은 멤버 변수로 name, hp, attack 3 개를 사용가능
{
    int attack;

    void doMove()
    {
        super.doMove();
        System.out.println(attack + " 공격");
    }
    void printMarine()          // 3. 메서드 호출
    {
        printUnit();
        System.out.println("공격력 : " + attack);      // 4.메서드를 호출하고 공격력 정보 호출, 메서드가 직접적을 나와 있지 않지만 상속받은 기능이기에 사용 가능
    }
}

class Medic extends Unit        // 5. 자식 클래스, 메딕 클래스를 유닛 클래스를 상속 받아 정의
{
    int heal;       // 6. 멤버 변수

    void doMove()
    {
        System.out.println("이동속도 8으로 이동");
        System.out.println(heal + "치유");
    }
    void printMedic()       // 7. 메딕 클래스에서 사용할 메서드 추가
    {
        printUnit();
        System.out.println("치유량 : " + heal);
    }
}
public class MyTerran {
    public static void main(String[] args)
    {
        Marine unit1 = new Marine();        // 8. 객체 생성
        unit1.name = "마린";                  // 9.
        unit1.hp = 100;                     // 10.
        unit1.attack = 20;

        Medic unit2 = new Medic();
        unit2.name = "메딕";
        unit2.hp = 120;
        unit2.heal = 10;

        unit1.printMarine();
        System.out.println();
        unit2.printMedic();
    }
}
