package CH23_EX;

import java.util.Arrays;

public class Ex02_Pipeline {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Pipeline 구성
        int sum = Arrays.stream(arr)        // 1. 스트림을 생성
                .filter(n -> n%2 == 1)      // 2. 중간 연산
                .sum();                     // 3. 최종 연산

        System.out.println(sum);
    }
}
