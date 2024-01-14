package CH15_EX;

import java.util.Arrays;

public class Ex_Arrayequals {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};       // 2.배열을 선언하고 직접 대입하여 초기화해준다.
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);       // 3. Arrays 클래스의 copyOf() 메서드를 이용하여 메서드 복사

        boolean bCheck = Arrays.equals(arr1, arr2);         // 4. 두 배열의 내용을 비교
        System.out.println(bCheck);
    }
}
