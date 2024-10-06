public class Hawk extends Bird {

    public Hawk(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Ястреб летит со скоростью - " + flySpeed + " км/ч");

    }

    @Override
    public void makeSound() {
        System.out.println("Ястреб кричит");

    }
}
