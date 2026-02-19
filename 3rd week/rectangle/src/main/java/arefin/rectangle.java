package arefin;

public class rectangle 
{
    double length;
    double width;

    double area()
    {
        double area = length * width;
        System.out.println("Area: " + area());
        return area;
    }

    double perimeter()
    {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter());
        return perimeter;
    }


}
