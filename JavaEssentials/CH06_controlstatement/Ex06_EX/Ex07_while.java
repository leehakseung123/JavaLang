package Ex06_EX;

public class Ex07_while {
    public static void main(String[] args)
    {
        int num = 0;
        int count = 0;

        while((num++) < 100)
        {
            // if (((num % 5) !== 0) || ((num % 7) != 0))
            //      continue;           // 5와 7의 배수가 아니면 위로 이동

            if( (num % 5) != 0)
                continue;
            if( (num % 7) != 0)
                continue;

            count++;                    // 5와 7의 배수이면 실행
            System.out.println(num);    // 5와 7의 배수이면 실행

        }

        System.out.println("count:" + count);   // 100보다 작은 정수 중에 5와7의 공배수의 총 개수를 출력
    }
}
