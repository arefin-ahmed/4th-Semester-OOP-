package arefin;

class PartTime extends Employee implements SalaryCalculator {
    double hourlyRate;
    int hours;

    PartTime(String n, int i, double r, int h) {
        super(n, i);
        this.hourlyRate = r;
        this.hours = h;
    }

    public double calculateSalary() {
        return hourlyRate * hours;
    }
}
