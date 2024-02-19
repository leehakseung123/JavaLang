package CH24_EX;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

public class Ex05_Copy1 {
    public static void main(String[] args) {
        String src = "./src/Ex04_FileRead.java";
        String dst = "FileRead1.txt";

        try (InputStream in = new FileInputStream(src);     // 1.
        OutputStream out = new FileOutputStream(dst))       // 2.
        {
            Instant start = Instant.now();      // 3.

            int data;
            while (true)            // 4.
            {
                data = in.read();
                if(data == -1)      // 5.
                {
                    break;          // 6.
                }
                out.write(data);
            }

            Instant end = Instant.now();        // 7.
            System.out.println("복사에 걸린 시간 : " + Duration.between(start, end).toMillis());       // 8.
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
