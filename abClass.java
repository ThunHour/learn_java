abstract class bank {
    abstract int getRate();
}

class SBI extends bank {
    int getRate() {
        return 7;
    };
}

class PNB extends bank {
    int getRate() {
        return 8;
    }
}

public class abClass {
    public static void main(String[] args) {
        bank b;
        b = new SBI();
        System.out.println(b.getRate());
        b = new PNB();
        System.out.println(b.getRate());

    }
}
