package arefin;

public class Motorcycle1 extends Vehicle implements Engine1 {
    int cc;

    Motorcycle1(String model, int year, int cc) {
        super(model, year);
        this.cc = cc;
    }

    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    void display() {
        System.out.println("Motorcycle: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("CC: " + cc);
        startEngine();
    }
}

