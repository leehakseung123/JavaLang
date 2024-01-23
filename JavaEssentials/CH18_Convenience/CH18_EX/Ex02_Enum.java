package CH18_EX;

enum Human2 {MAN, WOMAN}

enum Machine2 { TANK, AIRPLANE}
// 1.
public class Ex02_Enum {
    public static void main(String[] args) {
        createUnit(Machine2.TANK);      // 2. 알맞은 상수 사용

        // createUnit(Human2.MAN);      // 3. 잘못된 상수 사용 : 에러
        // 참고 : C 언어처럼 숫자로 비교하면 에러가 난다.
        // if (Human2.MAN == 0 ){}  4. 잘못된 상수 사용 : 에러
    }

    public static void createUnit(Machine2 kind)
    {
        switch(kind)
        {
            case TANK:  // 6.
                System.out.println("탱크 생성");
                break;
            case AIRPLANE:
                System.out.println("비행기 생성");
                break;
        }
    }
}
