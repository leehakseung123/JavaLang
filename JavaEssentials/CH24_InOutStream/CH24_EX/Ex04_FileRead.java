package CH24_EX;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex04_FileRead {
    public static void main(String[] args) {
        try( InputStream in = new FileInputStream("data.txt"))      // 1.
        {
            int dat = in.read();        // 2.
            System.out.println(dat);    // 3.
            System.out.printf("%c \n", dat);    // 4.
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}


