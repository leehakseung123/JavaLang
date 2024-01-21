package CH17_EX;

public class Ex09_UtilMethod {
    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(5);
        Integer n2  = Integer.valueOf("1024");
        // 메서드의 오버로딩

        System.out.println("큰 수 : " + Integer.max(n1, n2));     // 2. 큰 수
        System.out.println("작은 수 : " + Integer.min(n1, n2));    // 3. 작은 수
        System.out.println("합 : " + Integer.sum(n1, n2));       // 4.합

        System.out.println("12의 2진 표현 : 0B" + Integer.toBinaryString(12));      // 5. 2진수
        System.out.println("12의 8진 표현 : 0" + Integer.toOctalString(12));        // 6. 8진수
        System.out.println("12의 6진 표현 : 0x" + Integer.toHexString(12));         // 7. 16진수
    }
}
