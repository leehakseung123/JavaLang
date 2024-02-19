package CH24_EX;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex08_TextWrite {
    public static void main(String[] args) {
        try (Writer out = new FileWriter("text.txt"))       // 1.
        {
            for (int ch = (int)'A'; ch < (int)('Z'+1); ch++)        // 2.
            {
                out.write(ch);      // 3.
            }

            out.write(13);      // 4.
            out.write(10);      // 5.

            for (int ch = (int)'A' + 32; ch<(int)('Z' + 1 + 32); ch++)  // 6.
            {
                out.write(ch);
            }

            out.write(13);      // 7.
            out.write(10);      // 8.

            out.write("동해물과 백두산이 마르고 닳도록"); // 9.
            out.write("\r\n");  // 1.
            out.write("하느님이 보우하사 우리나라 만세");
            out.write("\r\n");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
