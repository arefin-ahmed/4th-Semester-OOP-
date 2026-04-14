package arefin;

public class Car extends Vehicle {
    int seatCapacity;

    //use super keyword
    public Car(String brand, String model, double price, String color, int seatCapacity) {
        super(brand, model, price, color);
        this.seatCapacity = seatCapacity;
    }

    // Method overriding
    @Override
    public void display() {
        super.display();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("----------------------");
    }
}
