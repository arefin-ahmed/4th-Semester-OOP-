package arefin;

public class Student1 {
    int id;
    String name;
    double cgpa;

    public Student1(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
