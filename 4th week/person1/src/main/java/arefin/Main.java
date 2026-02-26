package arefin;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("Rahim");
        p1.setAge(23);
        p1.setGender("Male");
        p1.setAddress("Dhaka");

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Gender: " + p1.getGender());
        System.out.println("Address: " + p1.getAddress());
    }

}
