package CH04_EX;

public class Ex02_Assignment {
    public static void main(String[] args)
    {
    short num = 10;
    num += 77L;         // 사람의 강제 형변환 필요하지 않음
    System.out.pringln(num);

    num =(short)(num +77L);   // num값을 long형으로 자동 형변환 후에 num과 77L을 더하게 됨. short타입으로 형변환 후 대입 가능하다.
    System.out.println(num);
}
}
