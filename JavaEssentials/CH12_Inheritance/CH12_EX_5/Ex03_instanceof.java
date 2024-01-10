package CH12_EX_5;

interface Cry
{
    void cry();
}

class Cat implements Cry
{
    public void cry()
    {
        System.out.println("야옹");
    }
}

class Dog implements Cry
{
    @Override
    public void cry()
    {
        System.out.println("멍멍");
    }
}
public class Ex03_instanceof
{
    public static void main(String[] args)
    {
        Cry test1 = new Cat();      // 1. 캣 클래스를 이용하여 객체를 만들고 상위 클래스형의 변수 test1에 참조 값을 대입

        if (test1 instanceof Cat)      // 2. 어떤 객체를 가르키는지 조사
        {
            test1.cry();
        } else if (test1 instanceof Dog)
        {
            System.out.println("고양이가 아닙니다.");
        }

    }
}
