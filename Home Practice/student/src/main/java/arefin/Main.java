package arefin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter CGPA:");
        double cgpa = sc.nextDouble();

        Student1 s1 = new Student1(id, name, cgpa);

        System.out.println("\nStudent Information:");
        s1.display();
    }
}
