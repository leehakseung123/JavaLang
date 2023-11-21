package CH04_EX;

public class Ex05_Compare {
    public static void main(String[] args)
    {
        System.out.println("2 >= 1 : " + (2 >= 1));
        System.out.println("2 <= 1 : " + (2 <= 1));

        // 비교 연산 시에도 형변환이 일어남
        System.out.println("1.0 == 1 : " + (1.0 == 1));     // true
        System.out.println("1.0 != 1 : " + (1.0 != 1));     // flase

        // 실수형으로 자동 형변환이 이뤄진 다음 연산을 수행했다.
        // 연산 시에도 형변환이 이뤄진다.
    }
}
