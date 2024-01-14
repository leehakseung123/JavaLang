package CH15_EX;

public class Ex11_PartiallyFilled {
    public static void main(String[] args) {
        int[][] arr = {
                {11},
                {22, 33},
                {44, 55, 66}
                // 부분적으로 채원진 2차원 배열을 만들고 초기화
        };

        // 배열의 구조대로 내용 출력
        for (int i=0; i<arr.length; i++) {   // 2. 바깥쪽 배열의 크기를 이용해 반복문을 반복
            for (int j=0; j<arr[i].length; j++) {   // 3. 바깥쪽 배열의 요소 하나당 배열의 크기를 구해서 반복문을 반복
                System.out.println(arr[i][j] + "\t");   // 4. 배열의 개별 요소의 값을 구해와서 출력
            }
            System.out.println();
            }
    }
}
