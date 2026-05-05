package arefin;

public class Engineer extends Employee {
    private double bonus;

    public Engineer(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double totalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary());
    }
}
