package CH24_EX;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex09_TextRead {
    public static void main(String[] args) {
        try (Reader in = new FileReader("text.txt"))
        {
            int ch ;

            while(true)
            {
                ch = in.read();     // 1.
                if (ch == -1)       // 2.
                {
                    break;
                }
                System.out.println((char)ch);   // 3.
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
