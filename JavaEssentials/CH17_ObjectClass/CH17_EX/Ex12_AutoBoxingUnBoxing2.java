package CH17_EX;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ex12_AutoBoxingUnBoxing2 {
    public static void main(String[] args) {


        Integer num = 10;       // 1. 오토 박싱

        num++;   // 2. 오토 박싱과 오토 언박싱 동시에 진행

        System.out.println(num);

        num += 3;       // 3.

        System.out.println(num);

        int r = num + 5;            // 4. 오토 언박싱 진행
        Integer rObj = num - 5;     // 5. 오토 언박싱 진행 + 오토 박싱 진행

        System.out.println(r);
        System.out.println(rObj);
    }
}
