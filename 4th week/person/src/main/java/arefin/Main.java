package arefin;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Rahim");
        Person p2 = new Person("Karim", 23, "Male", "Dhaka");

        p1.Info();      
        System.out.println();
        p2.InfoFull();   
    }

}
