package staff;

public abstract class Employee {

    private String name;
    private double niNumber;
    private double salary;

    public Employee(String name, double niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = this.name;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public double getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double amount) {
        if (amount < 0) {
            this.salary += 0;
        } else {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
