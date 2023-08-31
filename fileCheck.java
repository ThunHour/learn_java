import java.io.*;
public class fileCheck {
    public static void main(String[] args) {
        try{
            File folder=new File("E:/text javafirle");
            File[] files=folder.listFiles();
            for (File file : files) {
                if(file.isFile()) {
                    System.out.println(file);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
