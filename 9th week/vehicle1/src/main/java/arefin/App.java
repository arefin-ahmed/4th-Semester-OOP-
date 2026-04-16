package arefin;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();

        list.add(new Car1("Toyota", 2022, 4));
        list.add(new Motorcycle1("Yamaha", 2021, 150));

        for (Vehicle v : list) {
            v.display();
            System.out.println("--------------");
        }
    }
}
