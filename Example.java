import java.io.IOException;

class Example {
    public static void fun() throws IllegalAccessException,IOException {
            System.out.println("Inside fun().");
            throw new IOException("demo");
    }
    public static void main(String[] args) throws IOException {
        try {
            fun();
        } 
        catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
        catch (IOException e) {
            System.out.println("Caught by IOException");
        }
    }
}
