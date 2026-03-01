package arefin;

public class Student 
{
    String name;
    int id;
    String email;
    double cgpa;

    public Student(){

    }

    public Student(String name, int id, String email, double cgpa) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.cgpa = cgpa;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Email: " + email);
        System.out.println("CGPA: " + cgpa);
    }
}
