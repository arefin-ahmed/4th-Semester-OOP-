package arefin;

public class Person {
    String name;
    int age;
    String gender;
    String address;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    void Info(String name) {
        System.out.println("Name: " + name);
    }

    void Info(String name, int age, String gender, String address) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Address: " + address);
    }
}
