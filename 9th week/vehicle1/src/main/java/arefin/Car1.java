package arefin;

public class Car1 extends Vehicle implements Engine1 {
    int doors;

    Car1(String model, int year, int doors) {
        super(model, year);
        this.doors = doors;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    void display() {
        System.out.println("Car: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Doors: " + doors);
        startEngine();
    }
}
