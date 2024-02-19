package CH24_EX;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class Ex06_Copy2 {
    public static void main(String[] args) {
        String src = "./src/Ex04_FileRead.java";
        String dst = "FileRead2.txt";       // 1.

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst))
        {
            byte[] buf = new byte[1024];        // 2.
            int len;

            Instant start = Instant.now();

            while (true)
            {
                len = in.read(buf);     // 3.
                if (len == -1)
                {
                    break;
                }
                out.write(buf, 0, len); // 4.
            }

            Instant end = Instant.now();
            System.out.println("복사에 걸린 시간 : " + Duration.between(start, end).toMillis());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
