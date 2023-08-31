public class pow {
    public static void main(String[] args) {
        double value = 0;
        for (int i = 0; i < 1000; i++) {
            double pow = Math.pow(2, i);
            value = value + pow;
            if (value < 1000) {
                System.out.println(value);
            }
            else{
                break;
            }

        }
    }

}
