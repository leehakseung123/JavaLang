package CH18_EX;

interface  Human1
{
    int MAN = 1;
    int WOMAN = 2;
    // 1.
}

interface Machine1
{
    int TANK = 1;
    int AIRPLANE = 2;
    // 2.
}
public class Ex01_Constants {
    public static void main(String[] args) {
        createUnit(Machine1.TANK);      // 3. 알맞은 상수

        createUnit(Human1.MAN);         // 4. 잘못된 상수 사용
    }

    public static void createUnit(int kind)
    {
        switch (kind)
        {
            case Machine1.TANK:
                System.out.println("탱크 생성");
                break;
                case Machine1.AIRPLANE:
                    System.out.println("비행기 생성");
                    break;

        }
    }
}
