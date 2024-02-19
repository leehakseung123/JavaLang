package CH24_EX;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex14_ObjectInputStream {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.bin")))
                // 1. 기반 스트림인 FileInputStream에 보조 스트림인 ObjectInputStream응 이용하여 객체를 읽을 수 있는 기능을 추가하여 스트림을 생성한다.
        {
            Ex12_Unit unit1 = (Ex12_Unit) ois.readObject();     // 2. 스트림에서 객체를 읽어드린다.
            System.out.println(unit1.getName());        // 3.객체의 메서드 호출

            Ex12_Unit unit2 = (Ex12_Unit) ois.readObject();
            System.out.println(unit2.getName());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
