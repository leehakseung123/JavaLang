package CH07_EX;

public class Ex03_VariableScope {
    public static void main(String [] args)
    {
        boolean myState = true;
        int num1 = 11;

        if(myState)
        {
            // int num1 = 22;  // 같은 영역에서 사용할 수 있는 변수 두 개가 같게되어버려 에러 발생
            num1++;
            System.out.println(num1);
        }
        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }
        System.out.println(num2);   //각 방 안에 있는 변수를 알 수 있는 방법이 없기 때문에 에러 발생

        for (int i=0; i<3; i++)
        {
            System.out.println(i);
        }
        //  System.out.println(i); // 각 방 안에 있는 변수를 알 수 있는 방법이 없기 때문에 에러 발생
    }
}
