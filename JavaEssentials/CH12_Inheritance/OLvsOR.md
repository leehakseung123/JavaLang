## 오버로딩(Overloading) vs 오버라이딩(Overriding)

---

|구분|	오버로딩 (Overloading)|	오버라이딩 (Overriding)|
|:--|:--|:--|
|정의|	같은 클래스 내에서 같은 이름의 메서드를 매개변수 다르게 정의|	상속 관계에서 자식 클래스가 부모 클래스의 메서드를 재정의|
|전제 조건|	같은 클래스 내에서 사용 가능|	반드시 상속 관계 (extends)여야 함|
|매개변수|	자료형/개수/순서 중 하나 이상이 달라야 함|	부모 메서드와 완전히 동일해야 함 (이름, 매개변수, 반환형)|
|반환형|	달라도 가능|	반환형도 반드시 같아야 함|
|목적	|메서드의 기능 확장 (다양한 입력에 대해 같은 이름 사용)	|부모 클래스의 메서드를 기능 변경 또는 확장
|대표 예시|	System.out.println() –  다양한 자료형 출력|	자식 클래스에서 toString() 재정의|
|컴파일 시점  판단|	컴파일러가 메서드 시그니처로 판단	|런타임에 호출되는 메서드가|

### 오버로딩 예제
```java
class Calc {
int add(int a, int b) {
return a + b;
}

    double add(double a, double b) {
        return a + b;
    }

    int add(int a) {
        return a + 100;
    }
}
```
✔️ add()라는 동일한 이름의 메서드가 다양한 매개변수 조합으로 정의됨   
→ 오버로딩

### 오버라이딩 예제
```java
class Animal {
void sound() {
System.out.println("동물이 소리를 낸다");
}
}

class Dog extends Animal {
@Override
void sound() {
System.out.println("멍멍");
}
}
```
✔️ Dog 클래스가 Animal의 sound()를 재정의(override)

- 추가 팁: 어노테이션 `@Override`  
    - 오버라이딩할 때는 `@Override` 어노테이션을 붙이는 게 권장됨

    - 부모 메서드와 시그니처가 다를 경우 컴파일 에러 발생 → 실수 방지

---

#### 오버로딩이 적용된 대표 메서드
```java
System.out.println();        // 줄바꿈
System.out.println(123);     // 정수 출력
System.out.println("문자열"); // 문자열 출력
```
- 모두 println()이라는 같은 이름이지만 매개변수 종류가 다름   
 → 오버로딩 대표 사례

---
### 핵심 요약 문장 (면접용 암기 버전)
✔️ 오버로딩은 같은 클래스 내에서 매개변수를 다르게 하여 메서드를 여러 번 정의하는 것.  
✔️ 오버라이딩은 상속 관계에서 부모 메서드를 자식이 동일하게 다시 정의하는 것.

---

---
```java
//메소드 오버라이딩(Over riding), 올라타기
//  : 상속관계에서 자식클래스의 메소드가
//   부모클래스의 메소드를 재정의 하는 것
class Cable {
    int price = 1000;
    void sale(){
        System.out.println("Cable 판매");
    }
}
class PowerCable extends Cable {
    int price = 2000;
    @Override // 어노테이션 : 컴파일지시어
    void sale(){
        System.out.println("PowerCable 판매");
    }
}
public class ex30 {
    public static void main(String[] args) {
        PowerCable pc = new PowerCable();
        System.out.println(pc.price);
        pc.sale();
    }
}

```