package arefin;

abstract class Vehicle {
    private String model;
    private int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    abstract void startEngine();
    abstract void display();
}
