public class Eagle extends Bird {

    public Eagle(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Орёл летит со скоростью - " + flySpeed + " км/ч");
    }

    @Override
    public void makeSound() {
        System.out.println("Орёл кричит");
    }
}
