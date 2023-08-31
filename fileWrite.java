import java.io.*;

public class fileWrite {
    public static void main(String[] args) {
        try {
            FileWriter filewrite = new FileWriter("E:/list.txt");

            String data = "seak kimhour,china,rith";

            filewrite.write(data);

            System.out.println("data is written");

            filewrite.close();

            FileReader in = new FileReader("E:/list.txt");

            char[] content = new char[40];

            in.read(content);

            System.out.println(content);

            in.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
