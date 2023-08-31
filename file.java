import java.io.*;

public class file {
    public static void main(String[] args) {
        File f = new File("E:/text javafirle");

        // boolean canX = f.canExecute();

        // System.out.println("can Execute: " + canX);

        // boolean canR = f.canRead();

        // System.out.println("can read: " + canR);

        // boolean canW = f.canWrite();

        // System.out.println("can write: " + canW);

        // boolean ok = f.setExecutable(false);

        // System.out.println("Now Executable status : " + ok);

        // String absolutePath = f.getAbsolutePath();

        // System.out.println("File path is : " + absolutePath);

        // String name = f.getName();

        // System.out.println("File Name:" + name + f.getParent());

        // try {
        // String cononical = f.getCanonicalPath();

        // System.out.println("CanonicalPath:" + cononical);
        // }

        // catch (IOException e) {

        // e.printStackTrace();

        // }
        System.out.println("Exist:" + f.exists());

        System.out.println("Directory :" + f.isDirectory());

        System.out.println("That is a file:" + f.isFile());
        System.out.println("Hidden:" + f.isHidden());
        // hidden is use for check that file is hidden or not
        System.out.println("Last modified:" + f.lastModified());
        System.out.println("Lenght:" + f.length());
    }
}
