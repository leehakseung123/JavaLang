package CH07_EX;

public class Ex02_ReturnForExit {
    public static void main(String[] args)
    {
        divide(4, 2);
        divide(6, 2);
        divide(8, 0);
    }

    public static void divide(int num1, int num2)
    {
      if (num2 == 0)
      {
          System.out.println("0으로 나눌 수 없습니다.");
          return;       // 메서드를 해당 지점에서 종료시키는 용도로 사용
      }

      System.out.println("나눗셈 결과 : " + (num1 / num2));
    }
}
