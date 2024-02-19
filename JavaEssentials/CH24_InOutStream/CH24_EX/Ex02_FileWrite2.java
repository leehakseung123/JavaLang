package CH24_EX;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02_FileWrite2 {
    public static void main(String[] args) {
        OutputStream out = null;    // 1.

        try
        {
            out = new FileOutputStream("data.txt");
            out.write(65);      // ASCII 코드 65 = A
            // out.close();
            // 2.
        }
        catch (IOException e)
        {

        }
        finally {
            if ( out != null)
            {
                try
                {
                    out.close();
                }
                catch (IOException e2)
                {

                }
            }
        }
    }
}
