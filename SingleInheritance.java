class Employee {
    int employeeId;
    String name;
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int employeeId, String name, double basicSalary,
                      double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + calculateGrossSalary());
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        PermanentEmployee emp =
            new PermanentEmployee(101, "vidya", 30000, 6000, 3000);

        emp.displayDetails();
    }
}