package arefin;
public class Vehicle 
{
    private String brand;
    private String model;
    private double price;
    private String color;
    public Vehicle (String brand, String model, double price, String color)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

     public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }
}
