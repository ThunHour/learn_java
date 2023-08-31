import java.io.*;

public class fileStream {
    public static void main(String[] args) {
        try {
            InputStream file = new FileInputStream("/E:/text javafirle/example.txt");
            byte[] buf = new byte[4096];
            int len, count = 0;
            while ((len = file.read(buf)) > 0) {
                for (int i = 0; i < len; i++) {
                    System.out.print((char)buf[i]);
                    if (buf[i] == 97) {
                        count++;
                    }
                }
                System.out.println("a's seen: " + count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
