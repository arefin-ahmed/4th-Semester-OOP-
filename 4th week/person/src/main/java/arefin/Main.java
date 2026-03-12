package arefin;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Rahim");
        Person p2 = new Person("Karim", 23, "Male", "Dhaka");

        p1.Info(p1.name);      
        System.out.println();
        p2.Info(p1.name, p1.age, p1.gender, p1.address);   
    }

}
