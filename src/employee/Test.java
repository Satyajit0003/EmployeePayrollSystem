package employee;

public class Test {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Vikas", 1, 70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alexander", 2, 48, 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employees Details: ");
        payrollSystem.displayEmployees();
        System.out.println("Removing Employees: ");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employees Details");
        payrollSystem.displayEmployees();
    }
}
