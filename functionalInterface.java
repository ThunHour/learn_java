interface sayableFunction{
    void say(String msg);
}
public class functionalInterface  implements sayableFunction{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        functionalInterface say1 = new functionalInterface();
        say1.say("hello");
    }  
    
}
