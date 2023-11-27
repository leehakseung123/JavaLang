package CH05_EX;

public class Ex01_printf {
    public static void main(String[] args)
    {
        String name= "Hong gil dong";   // 글자들은 저장할 때 사용하는 자료형
        int age = 20;
        double height = 175.5;

        System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n",name, age,height);
        // \n을 이용하여 줄바꿈

        System.out.printf("%s의 나이는 %d이고, 키는 %.2입니다.\n" ,name, age,height);
        // 실수를 출력하면 너무 길게 출력되므로, 소수점 아래 두 자리까지만 출력
    }
}
