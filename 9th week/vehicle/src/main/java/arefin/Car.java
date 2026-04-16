public Car extends Vehicle implements Engine {
    int doors;

    Car(String model, int year, int doors) {
        super(model, year);
        this.doors = doors;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    void displayInfo() {
        System.out.println("Car: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Doors: " + doors);
        startEngine();
    }
