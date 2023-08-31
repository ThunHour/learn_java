
import java.util.function.BiFunction;
class ArithmeticX{
    public static int addNum(int a, int b) {
        return a+b;
    }

    public static float addNum(int  a, float b) {
        return a+b;
    }  
    public static float addNum(float a, float b) {
        return a+b;
    }  
}

public class Ex3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addI = ArithmeticX :: addNum;

        BiFunction<Float, Integer,  Float> addIF = ArithmeticX::addNum;

        BiFunction<Float, Float, Float> addF = ArithmeticX :: addNum;
        int result1=addI.apply(10, 20);
        float result2=addIF.apply(20.2f,10);
        float result3=addF.apply(10.0f,20.2f);

        System.out.println("result1:"+result1);

        System.out.println("result2:"+result2);
        System.out.println("result3:"+result3);

    }
}
