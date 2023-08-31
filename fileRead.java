import java.io.*;

public class fileRead {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("E:/text javafirle/example.txt"));

            String line;
            int lines = 0;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lines++;
            }
            System.out.println(lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
