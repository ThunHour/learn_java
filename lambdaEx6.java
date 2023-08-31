interface SayableXD{
    String say(String msg);
}
public class lambdaEx6 {
    public static void main(String[] args) {
        SayableXD person =(msg)->{
            String str1="Hello from java";
            String str2=str1+"I am Kimhour";
            return str2;
        };
        System.out.println(person.say("time is precious"));
    }
}

