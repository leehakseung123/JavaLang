# Chpter 05 콘솔 출력과 입력
---

## 콘솔 출력
> 콘솔 : 컴퓨터 대상으로 데이터를 입력 및 출력하는 장치를 총칭
> 
> 메서드 : 화면에 데이터를 출력하는 기능  
> + ystem.out과 연결하여 사용

+ 사용 형식  
``System.out.printf("포맷 문자열", 데이터, 데이터, ...)``
+ 사용 예시  
`` System.out.printf("정수 : %d, 실수 : %f, 글자 : %c, 글자들 : %s", 10, 'A', "홍길동" ``;
+ 출력 서식 지정자

| 서식지정자 |          출력의 형태           |
|:-----:|:-------------------------:|
|  %d   |       10진수 정수 형태 출력       |
|  %o   |       8진수 정수 형태 출력        |
|  %x   |       16진수 정수 형태 출력       |
|  %f   |           실수 출력           |
|  %e   |      e 표기법 기반 실수 출력       |
|  %g   | 출력 대상에 따라서 %e 또는 %f 형태 출력 |
|  %s   |          문자열 출력           |
|  %c   |           문자 출력           |

+ **e 표기법**
>1.0 X 10<sup>-10</sup> → 1.0e-10
> > 보기 편하게 e 문자를 사용하여 지수 사용

*Ex01_printf.java*

## 콘솔 입력
> Scanner 클래스는 편리한 콘솔 입력 기능을 제공
> + 메서드 : 다양한 데이터를 입력받을 수 있도록 Scanner클래스에서 제공하는 기능

*Ex02_Scanner1.java*  
*Ex03_Scanner2.java*

---

---
## tossbank 부캠
```java
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //Scanner클래스 함수들
        // nextLine() : 문자열을 입력받되 엔터칠때까지(공백포함)
        // next() : 문자열의 공백까지만 입력받음.
        // nextInt() : 문자열을 받아서 정수로 반환해줌.
        // nextFloat() :             실수로 반환해줌.
        // nextDouble() :            실수로 반환해줌.
        Scanner scan = new Scanner(System.in);
        System.out.println("입력하세요:");
        String str1 = scan.nextLine();
        System.out.println("str1 = " + str1);

        String str2 = scan.next();
        System.out.println("str2 = " + str2);

        //해결방안 : nextLine()함수를 한번 실행해준다.
        scan.nextLine();

        //Exception in thread "main" java.util.InputMismatchException
        //next()함수에 저장된 버퍼메모리가 정리되지 않아서이다.
        //해결방안 : nextLine()함수를 한번 실행해준다.
        int num1 = scan.nextInt();
        System.out.println("num1 = " + num1);

        scan.close(); //scan객체가 사용중인 리소스(메모리,입출력자원) 정리

    }
}
```
> Scanner를 이용해 문자열과 정수를 입력받는 과정에서, next() 후 남는 개행 문자를 nextLine()으로 처리해 입력 오류를 방지하는 코드

1. `Scanner scan = new Scanner(System.in);` :   
   표준 입력(System.in) 을 통해 키보드 입력을 받을 수 있게 하는 객체 생성.  
    Scanner는 java.util 패키지에 있으므로 import 필요.

-  주요 메서드 정리

    | 메서드                          |	설명|
    |:-----------------------------|:--|
    | `nextLine()`                 |	줄 단위 입력. 엔터까지 모두 읽음. 공백 포함 가능|
    | `next()`                     |	단어 단위 입력. 공백 전까지만 읽음|
    | `nextInt()`                  |	입력값을 정수(int)로 반환. 공백 또는 엔터 입력 필요|
    | `nextFloat()` / `nextDouble()`	 |입력값을 실수(float/double)로 반환|