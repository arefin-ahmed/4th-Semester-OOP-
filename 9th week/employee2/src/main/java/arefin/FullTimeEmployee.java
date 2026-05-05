package arefin;

class FullTimeEmployee extends Employee implements SalaryCalculator {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}
