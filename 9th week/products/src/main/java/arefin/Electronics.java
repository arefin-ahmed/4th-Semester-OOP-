package arefin;

public class Electronics extends Product implements Discountable {
    int warranty;

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public void calculateDiscount() {
        double discount = getPrice() * 0.10;
        System.out.println("Discount: " + discount);
    }

    void display() {
        System.out.println("Electronics: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Warranty: " + warranty + " years");
        calculateDiscount();
    }
}
