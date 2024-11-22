class Vehicle {
    String name;

    public Vehicle(String name, String type) {
        this.name = name;
        System.out.println("Vehicle name: " + name);
    }

    public void maxSpeed() {
        System.out.println("Max Speed of " + name + " is not defined.");
    }
}

class Car extends Vehicle {
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        super(name, "Car"); 
        this.maxSpeed = maxSpeed;
    }

    public void maxSpeed() {
        System.out.println("Max Speed of " + name + " (Car) is: " + maxSpeed + " km/h");
    }
}

class Bicycle extends Vehicle {
    private int maxSpeed;

    public Bicycle(String name, int maxSpeed) {
        super(name, "Bicycle");  
        this.maxSpeed = maxSpeed;
    }

    public void maxSpeed() {
        System.out.println("Max Speed of " + name + " (Bicycle) is: " + maxSpeed + " km/h");
    }
}

class Scooter extends Vehicle {
    private int maxSpeed;

    public Scooter(String name, int maxSpeed) {
        super(name, "Scooter");  
        this.maxSpeed = maxSpeed;
    }

    public void maxSpeed() {
        System.out.println("Max Speed of " + name + " (Scooter) is: " + maxSpeed + " km/h");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Tesla Model X", 250);
        Vehicle vehicle2 = new Bicycle("Mountain Bike", 30);
        Vehicle vehicle3 = new Scooter("Vespa", 80);

        vehicle1.maxSpeed();
        vehicle2.maxSpeed();
        vehicle3.maxSpeed();
    }
}
