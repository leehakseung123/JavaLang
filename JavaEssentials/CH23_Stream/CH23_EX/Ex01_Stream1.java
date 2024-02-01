package CH23_EX;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Ex01_Stream1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 1. 스트림 생성, 배열을 데이터 소스로 스트림을 만든다.
        IntStream stm1 = Arrays.stream(arr);

        // 2. 중간 연산, 매개변수를 하나씩 받아 나머지가 1인지 검사하여 참인 값만 반환한다.
        IntStream stm2 = stm1.filter(n -> n%2 == 1);

        // 3. 최종 연산, 모든 데이터의 값을 더한다.
        int sum = stm2.sum();

        System.out.println(sum);
    }
}
