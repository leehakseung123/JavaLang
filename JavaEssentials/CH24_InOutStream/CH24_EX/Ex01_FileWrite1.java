package CH24_EX;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_FileWrite1 {
    public static void main(String[] args)  throws IOException {
        OutputStream out = new FileOutputStream("data.txt");        // 1.
        out.write(65);      // 2. ASCII코드 65 = 'A'
        out.close();        // 3.
    }
}
