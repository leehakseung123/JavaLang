package CH23_EX;

import java.util.stream.IntStream;

public class Ex06_PreTerminal {
    public static void main(String[] args) {


        // 합
        int sum = IntStream.of(1, 3, 5, 7, 9)       // 1. of() 메서드로 여러 숫자를 직접 입력해 스트림으로 만들 수 있다.
                .sum();                                     // 2.합계를 구하는 최종 연산
        System.out.println("sum = " + sum);                 // 3.변수에 최종 연산의 결과를 반환받은 후 변수를 이용하여 값을 출력

        // 개수
        long cnt = IntStream.of(1, 3, 5, 7, 9)
                .count();           // 4. 스트림 데티어 개수를 세는 최종 연산
        System.out.println("count = " + cnt);

        // 평균
        IntStream.of(1, 3, 5, 7, 9)
                .average()                  // 5. 스트림 데이터 평균을 구하는 최종 연산
                .ifPresent(avg -> System.out.println("avg = " + avg));      // 6. 최종 연산 결과를 변수로 받지 않고 결과가 존재한다면 출력하는 처리

        // 최소
        IntStream.of(1, 3, 5, 7, 9)
                .min()             // 7. 스트림 데이터의 최솟값을 구하는 최종 연산
                .ifPresent(min -> System.out.println("min = " + min));

        // 최대
        IntStream.of(1, 3, 5, 7, 9)
                .max()          // 8. 스트림 데이터의 최댓값을 구하는 최종 연산
                .ifPresent(max -> System.out.println("max = " + max));
    }
}
