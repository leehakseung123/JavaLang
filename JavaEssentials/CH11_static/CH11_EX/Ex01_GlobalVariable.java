package CH11_EX;

class Cat {
    static int a = 5;       // static 변수
    int num = 3;

    void printValue(int num){
        this.num = num;
        System.out.println("num:" + this.num);
        System.out.println("a:" + a);
    }

}
public class Ex01_GlobalVariable {

    public static void main(String[] args)  // 프로그램 시작 지점
    {
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + ", " + num2);

        Cat cat1 = new Cat();           // 스택 영역에 생성
        cat1.num = 1;                   //
        cat1.a = 10;                    // static  변수에 직접 접근
        cat1.printValue(cat1.num);      // 함수 호출
        System.out.println(cat1.num);   //
        System.out.println(cat1.a);   //

        Cat cat2 = new Cat();           //  스택 영역에 생성
        cat2.num = 2;                   // 스택 영역에 생성
        cat2.a = 11;                    //
        cat2.printValue(10);        //함수 호출
        System.out.println(cat1.num);   //
        System.out.println(cat2.a);   //
        System.out.println(cat1.a);   //


    }
}
