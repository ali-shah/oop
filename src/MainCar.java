package src;


import java.util.Scanner;

public class MainCar {

    public static void main(String[] args) {

        Car car ;
        System.out.println("Functions of a Car: ");
        (new Car()).startEngine();
        (new Car()).accelerate();
        (new Car()).brake();
        (new Car()).brake("ABS");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Hyundai creta\n2-BMW 7 \n3-Toyota Fortuner");
        System.out.println("Enter your choice: ");
        int ch = scanner.nextInt();

        switch(ch) {

            case 1: car = new Hyundai("Creta", 2);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 2: car = new BMW("7", 4);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            case 3: car = new Toyota("Fortuner", 6);
                System.out.println(car.getName() + " has " + car.getCylinders() + " cylinders.");
                car.startEngine();
                car.accelerate();
                car.brake();
                break;

            default:
                System.out.println("Enter Valid Choice.");

        }

    }

}
