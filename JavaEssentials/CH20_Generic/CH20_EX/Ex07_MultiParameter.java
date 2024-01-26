package CH20_EX;

class Camp7<T1, T2>        //1. 다이아몬드 연산자 안의 타입 매개변수는 원하는 형식으로 작성 가능
{
    private T1 param1;
    private T2 param2;

    public void set(T1 o1, T2 o2)
    {
        param1 = o1;
        param2 = o2;
    }

    public String toStinrg()
    {
        return param1 + " & " + param2;
    }
}



public class Ex07_MultiParameter
{
    public static void main(String[] args) {
        Camp7<String, Integer> camp = new Camp7<>();        // 2. 앞쪽 다이아몬드 연산자에 제네릭으로 사용할 데이터형을 지정해주고 뒤쪽 다이아몬드에서는 생략하고 객체를 생성
        camp.set("Apple", 25);
        System.out.println(camp);       // 3. 클래스에 toString() 메서드가 오버라이딩으로 재정의되어 있으므로 해당 메서드 내용이 출력
    }
}
