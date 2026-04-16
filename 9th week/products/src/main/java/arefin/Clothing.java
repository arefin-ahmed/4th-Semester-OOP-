package arefin;

public class Clothing extends Product implements Discountable {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void calculateDiscount() {
        double discount = getPrice() * 0.20;
        System.out.println("Discount: " + discount);
    }

    void display() {
        System.out.println("Clothing: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Size: " + size);
        calculateDiscount();
    }

}
