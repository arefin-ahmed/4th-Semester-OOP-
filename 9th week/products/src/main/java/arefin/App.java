package arefin;
import java.util.ArrayList;
public class App 
{
    public static void main( String[] args )
    {
          ArrayList<Product> list = new ArrayList<>();

        list.add(new Electronics("Laptop", 80000, 2));
        list.add(new Clothing("T-Shirt", 1000, "L"));
        list.add(new Book("Java Programming", 500, "Arefin"));

        for (Product p : list) {
            p.display();
            System.out.println("------------------");
        }
    }
}
