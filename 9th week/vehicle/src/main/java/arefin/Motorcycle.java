public Motorcycle extends Vehicle implements Engine {
    int cc;

    Motorcycle(String model, int year, int cc) {
        super(model, year);
        this.cc = cc;
    }

    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    void displayInfo() {
        System.out.println("Motorcycle: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("CC: " + cc);
        startEngine();
    }
}
