package arefin;

public class Main 
{
     public static void main( String[] args )
    {
        employee e1 = new employee("Arefin", 22, "Manager", 50000);
        employee e2 = new employee("Rahim", 25, "Developer", 40000);
        employee e3 = new employee("Karim", 30, "HR", 35000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        employee.showTotalEmployees();
    }
}
