package CH16_EX;

public class Ex06_ExceptionThrow {
    public static void myMehtod1(int n)
    {
        myMehtod2(n, 0);
    }

    publiic static void myMehtod2(int n1, int n2)
    {
        int r = n1/ n2;     //1. 예외 발생 지점
    }

    public static void main(String[] args) {
        myMehtod1(3);
        System.out.println("Exception Thrwo !!!");      // 2.
    }
}
