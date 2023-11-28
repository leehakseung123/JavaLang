package Ex06_EX;

public class Ex09_BreakLabel {
    public static void main(String[] args)
    {
        int sum = 0;

        myExit: while (true)            // 무한반복
        {
            for (int i=0; i<100; i++)   // 중첩된 반복문 생성
            {
                sum = sum + i;
                if (sum > 2000)
                {
                    System.out.printf("%d : %d\n", i, sum);
                    break myExit;       // 지정한 레이블을 break에 붙여준다.
                }
            }
        }
    }
}
