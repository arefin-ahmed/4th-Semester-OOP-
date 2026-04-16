package arefin;

import java.util.ArrayList;

import main.java.arefin.Vehicle;

public class App {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<>();

        list.add(new Car("Toyota", 2022, 4));
        list.add(new Motorcycle("Yamaha", 2021, 150));

        for (Vehicle v : list) {
            v.displayInfo();
            System.out.println("--------------");
        }
    }
}
