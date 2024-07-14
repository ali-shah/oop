package src;

public class Toyota extends Car {

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Toytoa Fortuner started");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota Fortuner Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Toyota Fortuner stopped, Brakes applied");
    }

}