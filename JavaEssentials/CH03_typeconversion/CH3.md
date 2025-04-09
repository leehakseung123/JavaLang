# Chapter 3 변수, 상수, 자료형의 형변환
___

##  변수

 ### 변수의 이해
> 변수 : 값이 변하는 수

+ ``` y = x + 1; ```
     > x, y ( 변수 ) : 대입되는 값에 따라 값이 변한다.  
      1 ( 상수 ) : 이미 정해져 있는 값.

+ `` int num = 1;``  
    > 1. 자료형이 int이므로 메모리에 주소 4개를 확보하여 공간 확보  
    > 2. 십진수 1을 이진수로 변경하여 공간에 저장
    > 3. 공간(주소)을 변수 num기억

+ ```System.out.println(num);```
  > 1. num 변수의 값을 메모리 어디에 적어두었는지 찾아온다.  
  > 2. 찾아낸 메모리의 시작 위치로 찾아간다.
  > 3. num 변수는 int형으로 4비트를 읽는다.
  > 4. 10진수로 바꾸어 숫자로 표기한다.
  >   + char형이면 디코딩하여 문자로 표기

### 변수명을 짓는 방법
  > <규칙>
  > + 숫자로 시작할수 없다.
  > + 특수문자는 변수의 이름 사용 불가
  >     + $, _ 는 제외
  > + 키워드는(ex.public, class, ...) 변수의 이름으로 사용 불가
  > 
  > <권장사항>
  > + 소문자로 시작한다. ↔ 대문자로 시작하는 CLASS와 구별
  > + 데이터를 유추할 수 있는 이름으로 생성

---
## 상수
> 상수 : 변하지 않는 값
>>   1. 리터럴 상수 : 문자 그대로의 값  
>>   2. final 상수 : 프로그래머가 임의로 만든 상수
>>      + 대문자를 이용해서 만든다.

---

## 자료형의 형변환
### 상수값 대입 시 형변환
```
public class Ex02_TypeChange01
{
  public static void main(String[] args)
  {
    int num1 = 1;     //  ①
    byte num2 = 1;    //  
    byte num3 = 127;  //  ②
    byte num4 = 128;  //  ③
    
    short num5 = 1;
    
    num2 = num5;  //  ④
    num2 = (byte)num5;  //  ⑤
  } 
}
```
> ① - int형 리터럴 상수 1을 int형 변수 num2에 대입하여 자연스럽다.  
> ② - 큰 쪽에서 작은쪽으로 자동 형변환  
> ③ - 상수가 변수에 저장할 수 있는 범위의 값보다 큰 값이면 컴퓨터는 출력 불가 → 에러
> ④ - 변수이면 타입만 비교 후 에러처리
> ⑤ - 프로그래머가 직접 책임지고 명시적으로 표시

+ 형반환 표현

    | 주최          | 용어 2   | 용어 2         |
    |:------------|:-------|:-------------|
    | 컴파일러 (자동으로) | 자동 형변환 | 묵시적(암묵적) 형변환 |
    | 프로그래머 (직접)  | 강제 형변환 | 명시적 형변환      |
  + 자동 형반환의 방향  
    ```plaintext
    1바이트     2바이트     4바이트    8바이트     4바이트     8바이트  
     byte   →   short   →   int   →   long   →   float   →  double 
                             ↑
                            char
    ```
    - 예제
      ```
      public class Ex03_TypeChange2
      {
        public static void main(String[] args)
        {
          int num1 = 2147483647;    //  ① OK
          int num2 = 2147483648;    //  ② 에러 발생
          long  num3 = 2147483647;  //  ③ 에러 발생
          long  num4 = 2147483647L; //  ④ OK L을 붙여 형변환 표시
    
          float num5 = 1.0;         //  ⑤ 에러 발생
          float num6 = 1.0F;        //  ⑥ F를 붙여 형변환 표시
    
          double num7 = 30;         //  int ▷ double 자동 형변환
        }
      }
      

### 연산시 형변환

- int, long, float, double을 제외한 자료형은 형변환 필요
- 예제  
```
public class Ex05_Calculation2
  {
  public static void main(String[] args)
  {
    int num31 = 1;
    int num32 = 2;
    int result = num31 + num32;     // OK
    
    long num41 = 1;
    long num42 = 2;
    long result4 = num41 + num42;   // OK
    
    long result5 = num31 + num41;   // OK 자동 형변환 (int ▶ long)
    
    float num61 = 1.0f;             // f 접미사 
    float num62 = 2.0f;             // f 접미사
    float result6 = num61 + num62;  // OK
    
    double num71 = 1.0f;            
    double num72 = 2.0f;
    double result7 = num71 + num72; // OK
    
    double result8 = num61 + num71; // OK 자동 형변환 (float ▶ double)
```

---

---
## tossbank 부캠
```java
public class ex04 {
    public static void main(String[] args) {
        //형변환 type casting
        //형변환 공식
        //1. 작은 정수형 -> 큰 정수형 (문제없음)
        //2. 큰 정수형 -> 작은 정수형 (표현범위 벗어나면 값잘림)
        //3. 실수형 -> 정수형(값잘림, 소숫점 날아감)
        //4. 정수형 -> 실수형(문제없음)

        //자동 형변환 : 대입(산술)연산자를 통해 자동으로 형변환 됨.
        //수동 형변환 : 형변환 연산자 (타입)을 통해 형변환 할때.

        //자동 형변환
        // 1. 같은 타입끼리 연산될 때
        // int * int => int
        // long * long => long
        int i = 10 * 20;
        System.out.println("i = " + i);
        // 2. 다른 타입끼리 연산될 때
        // int * long => long
        // long * float => float
        long l = 10 * 20L;
        // int j = 10 * 20L;    -> 오류 생김 int가 더 작은 타입

        // 3. 작은 타입에서 큰 타입으로 대입될 때
        long a = 10;


        // 수동(강제) 형변환
    }
}
```

#### Java 형변환(Type Casting)
🔹 형변환이란?
- 서로 다른 자료형 간 값을 변환하는 것
- 연산 또는 대입 과정에서 자료형이 다를 경우, 자동 또는 수동으로 형을 맞추는 작업이 필요하다.


- 형변환의 2가지 종류
  -    자동 형변환 (묵시적) : 	자료 손실이 없을 때, 컴파일러가 자동 수행	  
      int → long, float → double
    -    수동 형변환 (명시적) :	자료 손실 가능성 있으므로 개발자가 직접 형변환 연산자 사용  	
    (int)3.14, (byte)1000


- 🔹 형변환 기본 공식
  > - 작은 정수형 → 큰 정수형
  >   -  문제 없음 (ex: int → long, byte → int)
  >   
  > - 큰 정수형 → 작은 정수형
  >   -  표현 범위를 초과하면 값 잘림(truncation) 발생 (ex: long → int)
  >
  > - 실수형 → 정수형
  >   -  소수점 이하 절삭 (값 손실 있음)
  >
  > - 정수형 → 실수형
  >   - 문제 없음 (정수가 소수점 형태로 변환됨)

- 자동 형변환
  1. 같은 타입끼리 연산  
     ```sql
      int i = 10 * 20; // int * int = int
     ```
  2. 다른 타입끼리 연산
        ```sql
        long l = 10 * 20L; // int * long = long
         // int j = 10 * 20L; // 오류! 결과가 long인데 int에 대입하려고 해서
        ```
  3. 작은 타입에서 큰 타입으로 대입
       ```sql
       long a = 10; // int 값이 자동으로 long으로 형변환되어 저장됨
     ```

- 수동 형변환 (Explicit Casting)
  > 개발자가 직접 형을 변환할 때 사용함. 데이터 손실 가능성을 감수함.
    ```sql
  double pi = 3.14;
  int intPi = (int) pi; // 결과: 3 (소수점 잘림)
  
  long big = 100000L;
  int small = (int) big; // 큰 수를 작은 타입으로 변환 (주의 필요)
  ```