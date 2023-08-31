interface Messageable{
    Message getMessage(String message);
}
class Message{
    Message(String message){
        System.out.println("Your message is :"+message);
    }
}
public class EX5 {
    public static void main(String[] args) {
        Messageable msg = Message :: new;
        msg.getMessage("I came back to Phnom Penh");

    }
}
