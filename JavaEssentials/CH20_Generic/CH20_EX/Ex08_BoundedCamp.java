package CH20_EX;

class Camp8<T extends Number>       // 1. 매개변수의 타입 제한이  Number 클래스를 상속받은 것으로 제한이 걸려 있다.
{
    private T ob;

    public void set(T o) {
        ob = o;
    }
    public T get() {
        return  ob;
    }
}
public class Ex08_BoundedCamp {
    public static void main(String[] args) {

        Camp8<Integer> iBox = new Camp8<>();
        iBox.set(24);       // 2. 래퍼 타입으로 박싱될 수 없는 값이 입력되면 에러가 발생

        Camp8<Double> dBox = new Camp8<>();
        dBox.set(5.97); // 3. 래퍼 타입으로 박싱될 수 없는 값이 입력되면 에러가 발생

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
