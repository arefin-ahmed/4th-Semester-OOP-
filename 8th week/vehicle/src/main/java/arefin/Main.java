package arefin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Honda", "Civic", 30000, "Black", 5));
        vehicles.add(new Motorcycle("Yamaha", "R15", 5000, "Black", false));
        vehicles.add(new Car("Mercedes", " G 580", 50000, "Black", 5));
        vehicles.add(new Motorcycle("Harley-Davidson", "Street 750", 7500, "Black", true));
        vehicles.add(new Car("Hummer", "H2", 650000, "Black", 7));

        // Display all vehicles (polymorphism)
        for (Vehicle v : vehicles) {
            v.display();
        }
        /*Using traditional "for" loop
        for (int i = 0; i < vehicles.size(); i++) {
       Vehicle v = vehicles.get(i);
      v.display();*/
}
}

