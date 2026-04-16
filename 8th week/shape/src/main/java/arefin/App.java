package arefin;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle", "Red", 5));
        shapes.add(new Rectangle("Rectangle", "Blue", 4, 6));
        shapes.add(new Circle("Circle", "Green", 3));

        for (Shape s : shapes) {
            s.display();
        }
    }
}
