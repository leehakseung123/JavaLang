package CH17_EX;

public class Ex11_AutoBoxingUnBoxing {
    public static void main(String[] args) {

        // 오토 박싱
        Integer iObj = 10;
        Double dObj = 3.14;
        // 1.

        // 오토 언박싱
        int num1 = iObj;
        double num2 = dObj;
        // 2.

        System.out.println(num1 + " : " + iObj);
        System.out.println(num2 + " : " + dObj);
    }
}
