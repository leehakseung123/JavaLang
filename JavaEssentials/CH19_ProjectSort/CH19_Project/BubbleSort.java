package CH19_Project;

import java.util.Scanner;

public class BubbleSort {
    public static void getNumber(int[] num)     // 매개변수로 배열을 사용
    {
        Scanner sc = new Scanner(System.in);    // 입력 스트림 처리하는 스캐너 클래스 정의
        System.out.println("10개의 정수를 무작위로 입력하시오.");

        for (int i=0; i<num.length; i++)
        {
            num[i] = sc.nextInt();
        }
        // 반복문을 사용해 정수 10개 입력
    }

    public static void bubbleSort(int[] num)
    {
        for (int i=0; i<num.length; i++)
        {
            for (int j=0; j<num.length-i-1; j++)
            {
                if ( num[j] > num[j+1] )
                {
                    int tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;

                }
            }
        }
    }
    public static void main(String[] args) {

        int[] num = new int[10];        // 입력된 정수 10개를 처리하는 배열을 정의

       getNumber(num);      // 메서드에 배열의 참조 변수를 매개변수로 넘김, 정수 10개를 무작위로 입력

        bubbleSort(num);    // 버블 정렬을 구현한 메서드에 배열의 참조 변수를 넘겨서 정렬

        for (int i=0; i< num.length; i++)
        {
            System.out.println(num[i] + " ");
        }
        // 입력된 값을 배열에 제대로 저장했는지 반복문으로 배열의 요소를 출력해 확인

        System.out.println();
    }
}
