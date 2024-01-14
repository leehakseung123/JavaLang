package CH15_EX;

import java.util.Arrays;
public class Ex14_ArraySort {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        double[] arr2 = {4.4, 3.3, 2.2, 1.1};
        String[] arr3 = {"홍길동", "전우치", "손오공", "멀린"};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        // 기존 배열 안의 값을 정렬해준다.

        for ( int n : arr1)             // 2. 향상된 기능의 for문을 이용하여 배열 안의 내용을 하나씩 꺼내서 변수 n에 대입
            System.out.println(n  + "\t");;
        System.out.println();

        for ( double d : arr2)
            System.out.println(d  + "\t");;
        System.out.println();

        for ( String s : arr3)
            System.out.println(s  + "\t");;
        System.out.println();
    }
}
