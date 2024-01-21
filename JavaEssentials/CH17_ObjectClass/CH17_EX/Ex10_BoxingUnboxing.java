package CH17_EX;

public class Ex10_BoxingUnboxing {
    public static void main(String[] args) {


        // 박싱
        Integer iObj = Integer.valueOf(10);
        Double dObj = Double.valueOf(3.14);
        // 1.

        int num1 = iObj.intValue();
        double num2 = dObj.doubleValue();
        // 2.

        System.out.println(num1 + " : " + iObj);
        System.out.println(num2 + " : " + iObj);
        System.out.println();
        // 3.

        //래퍼 인스턴스 값의 증가 방법
        iObj = Integer.valueOf(iObj.intValue() + 10);
        dObj = Double.valueOf(dObj.doubleValue() + 1.2);    // 4.

        System.out.println(iObj);
        System.out.println(dObj);
    }
}
