package CH17_EX;

class Book5
{
    String author;
}
public class Ex05_equals {
    public static void main(String[] args) {
        Book5 myBook1 = new Book5();        // 1. 새로운 객체를 만들고 변수에 대입
        myBook1.author = "홍길동";

        Book5 myBook2 = new Book5();        // 2. 새로운 객체를 만들고 변수에 대입
        myBook2.author = "홍길동";

        if (myBook1.equals(myBook2))        // 3.두 객체를 비교
        {
            System.out.println("두 객체의 참조 id는 같습니다.");
        }
        else {
            System.out.println("두 객체의 참조 id는 다릅니다.");
        }
    }
}
