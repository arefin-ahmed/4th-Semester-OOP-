package arefin;

public class Book extends Product implements Discountable {
    String author;

    Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public double calculateDiscount() {
        double discount = getPrice() * 0.05;
        System.out.println("Discount: " + discount);
        return discount;
    }

    void display() {
        System.out.println("Book: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Author: " + author);
        calculateDiscount();
    }

}
