package CH15_EX;

public class Ex05_ArrayInMethod {
    public static void main(String[] args) {
        int[] arr = makeIntArray(5);

        int sum = sumOfArray(arr);      // 1. makeIntArray(5) 메서드 자리에 반환된 배열 객체가 들어오게 된다.

        System.out.println(sum);        // 2. 배열을 인수로 넘겨줄 수도 있다.
    }

    public static int[] makeIntArray(int len)       // 3. 메서드의 반환형이 int형 배열
    {
        int[] arr = new int[len];                   //4. 매개변수로 들어온 값으로 배열 개수를 정한다.
        for(int i=0; i<len; i++)
        {
            arr[i] = i;
        }
        return arr;         // 5.
    }
    public static int sumOfArray(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)        // 6. 배열의 요수 개수만큼 반복문을 실행
        {
            sum += arr[i];              // 7. 배열의 요소별 접근은 인덱스 값을 이용하여 객체 참조
        }
        return sum;
    }
}
