package CH24_EX;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex11_BufferedReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("text2.txt")))       // 1.
        {
            String str;

            while (true)
            {
                str = br.readLine();           // 2.
                if (str == null)            // 3.
                {
                    break;
                }
                System.out.println(str);    // 4.
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
