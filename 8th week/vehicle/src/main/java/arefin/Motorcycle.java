package arefin;

class Motorcycle extends Vehicle {
     boolean sidecar;
    
    // Constructor using super
    public Motorcycle(String brand, String model, double price, String color, boolean sidecar) {
        super(brand, model, price, color);
        this.sidecar = sidecar;
    }

    // Method overriding
    @Override
    public void display() {
        super.display();
        System.out.println("Has Sidecar: " + sidecar);
        System.out.println("----------------------");
    }
}
