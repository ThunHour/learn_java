abstract class Bigbank {
    abstract int getBalance();
}

class BankA extends Bigbank {
    int getBalance() {
        return 100;
    }
}

class BankB extends Bigbank {
    int getBalance() {
        return 150;
    }
}

class BankC extends Bigbank {
    int getBalance() {
        return 200;
    }
}

public class abstractBank {
    public static void main(String[] args) {
        Bigbank b;
        b = new BankA();
        System.out.println(b.getBalance());
        b = new BankB();
        System.out.println(b.getBalance());
        b = new BankC();
        System.out.println(b.getBalance());

    }
}
