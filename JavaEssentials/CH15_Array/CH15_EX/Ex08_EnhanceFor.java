package CH15_EX;

public class Ex08_EnhanceFor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};        // 1. 배열의 초기화 값이 주어져 있으므로 배열 객체의 생성 부분을 생략가능

        // 2. 배열 요소 전체 출력, 배열에서 배열의 요소 하나씩을 자동으로 꺼내주면서 반복이 실행
        for(int e:arr) {
            System.out.println(e +" ");
        }
        System.out.println();



    int sum = 0;

    //배열 요소의 전체 합 출력
    for(int e:arr) {
            sum = +e;
        }
        System.out.println("sum : " + sum);
    }
}
