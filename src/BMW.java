package src;

public class BMW extends Car {

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW started");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("BMW stopped, Brakes applied");
    }

    @Override
    public void brake(String type) {
        System.out.println("BMW stopped, " + type + " Brakes applied");
    }

}