package arefin;

class Contractor extends Employee implements SalaryCalculator {
    double hourlyRate;
    int hoursWorked;

    Contractor(String name, int id, double rate, int hours) {
        super(name, id);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}