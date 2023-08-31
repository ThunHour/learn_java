interface saySpeak{
    void Speak();
}
public class EX4 {
    public void sayWord(){
        System.out.println("Hello Cambodia");
    }
    public static void main(String[] args) {
        //first way
        EX4 m1= new EX4();
        saySpeak s1=m1 :: sayWord;
        s1.Speak();
        //second way
        saySpeak s2=new EX4():: sayWord;
        s2.Speak();
    }
}
