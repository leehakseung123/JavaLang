package CH15_EX;

public class Ex10_ForInFor {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];       // 1. 2차원 배열 선언

        int num =1;

        for(int i=0; i<3; i++) {
            // 먼저 i로 층을 정하고 여기서 j로 각 층의 방을 다룬다
            for(int j=0; j<3; j++) {    // 2.
                arr[i][j] = num;        // 3.
                num++;                  // 4.
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(arr[i][j] + "\t");   // 5. 중첩된 for문을 통해 2차원 배열의 모든 요소의 값을 가져와서 출력
            }
            System.out.println();
        }
    }
}
