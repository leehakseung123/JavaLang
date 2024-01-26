package CH20_EX.Ex09_GenericMethod;

class MyData
{
    public static <T> T showData(T data)        // 1.다이아몬드 연산자가 형을 파악하거나 추론하여 메서드의 매개변수 형을 정한다.
    {
        if (data instanceof String)
            System.out.println("String");
        else if (data instanceof Integer)
            System.out.println("Integer");
        else if (data instanceof Double)
            System.out.println("Double");
        return data;
    }
}
public class Ex09_GenericMethod {
    public static void main(String[] args) {
        MyData.<String>showData("Hello World");
        MyData.showData(1);     // <Integer> 생략
        MyData.showData(1.0);   // <Double> 생략
        // 2.showData() 메서드에 입력되는 값의 형태에 따라 형 결정
    }
}
