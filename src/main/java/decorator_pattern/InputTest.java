package decorator_pattern;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        InputStream in = new LowerCaseInputStream(new BufferedInputStream(System.in));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while((c=in.read())>=0)
            System.out.print((char)c);

        in.close();
    }
}
