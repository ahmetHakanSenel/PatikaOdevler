import java.util.Calendar;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        return totalSalary;
    }

    public String toString() {
        return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours
                + "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : "
                + calculateTotalSalary() + "\nToplam Maaş : " + (salary + bonus() + raiseSalary());
    }
}
