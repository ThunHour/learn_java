interface AnimalEat {

    void eat();
}

interface AnimalTravel {

    void travel();
}
class AnimalAction implements AnimalEat, AnimalTravel {
    public void eat() {

        System.out.println("Animal is eating");
    }

    public void travel() {

        System.out.println("Animal is traveling");
    }
}

public class multipleInheritance {

    public static void main(String[] args) {

        AnimalAction animal = new AnimalAction();
        animal.eat();
        animal.travel();

    }

}
