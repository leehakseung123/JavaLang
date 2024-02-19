package CH24_EX;

public class Ex12_Unit implements java.io.Serializable
// 1. implements에 사용된 java.io.Serializable 인터페이스는 구현할 기능이 없는 마커 인터페이스이다, 이 클래스에 직렬화를 사용해도 된다는 표시이다.
{
    private static final long serialVersionUTD = 1L;
    // 2. serialVersionUID는 직렬화에 사용되는 고유 아이디인데,
    // 선언하지 않으면 JVM에서 디폴트로 자동 생성한다. 하지만 사용하지 않으면 이클립스에서 워닝이 보이게 되므로 선언하고 사용한다.
    private String name;

    public Ex12_Unit(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
