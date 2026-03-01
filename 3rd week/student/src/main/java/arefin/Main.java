package arefin;

public class Main {
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.name = "Sourob";
        s1.id = 1014022;
        s1.email ="sourob780@gmail.com";
        s1.cgpa = 3.50;

        s1.display();

        System.out.println();

        Student s2 = new Student("Souvik", 241033, "souvik@gmail.com", 3.75);
        s2.display();
    }

}
