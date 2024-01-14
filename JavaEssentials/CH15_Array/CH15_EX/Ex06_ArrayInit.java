package CH15_EX;

class BoxA6{        // 1. BoxA6 정의

}

public class Ex06_ArrayInit {
    public static void main(String[] args) {
        int[] arr1 = new int[3];            // 2. 기본 자료형은 별도의 초기화를 하지 않아도 된다. int형이므로 0으로 초기화
        int[] arr2 = new int[] {1, 2, 3};   // 3. 뒤에 초기화하는 데이터 개수로 숫자를 파악할 수 있으므로 대괄호 안의 숫자를 생략할 수 있다.
        double[] arr3 = {1.0, 2.0, 3.0};    // 4. 뒤에 초기화하는 데이터 개수로 배열임을 알 수 있고 숫자를 파악할 수 있으므로 객체의 배열 생성 부분을 생략가능
        double[] arr4 = new double[3];      // 5. 기본 자료형은 별도의 초기화를 하지 않아도 초기화된다.  double형이므로 0.0으로 초기화된다.
        BoxA6[] arr5 = new BoxA6[3];

        for(int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i] + " ");
            System.out.println(arr2[i] + " ");
            System.out.println(arr3[i] + " ");
            System.out.println(arr4[i] + " ");
            System.out.println(arr5[i] + " ");
            System.out.println();
        }
    }
}
