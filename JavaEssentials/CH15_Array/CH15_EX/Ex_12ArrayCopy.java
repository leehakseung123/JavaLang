package CH15_EX;

import java.util.Arrays;        // 1. 클래스 임포트
public class Ex_12ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[10];               // 2. 길이가10인 arr1 배열은 0으로 초기화
        int[] arr2 = new int[8];                // 3. 길이가 8인 arr2 배열은 0으로 초기화

        // 배열 arr1을 3으로 초기화
        Arrays.fill(arr1, 3);               // 4. 매서드를 이용하여 지정한 값으로 배열을 채워줄 수 있다.

        // 배열 arr1을 arr2로 부분 복사
        System.arraycopy(arr1, 0, arr2, 3, 4);    // 5. 기존에 만들어진 배열에 부분 복사2

        // arr1 츨력
        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();

        // arr2 츨력
        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println();

        // 배열 arr1을 arr3로 부분 복사
        int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);    // 6. 배열에서 부분 복사하여 반환한 객체를 배열에 대입

        //arr3 출력
        for(int i=0; i< arr3.length; i++){
            System.out.println(arr3[3] + " ");
        }
        System.out.println();
        }
    }

