package Inheritance;

public class Manager extends Employee {
    private int num_of_employees;

    public Manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary);

        this.num_of_employees = num_of_employees;
    }

    public void increaseAmount(int amount) {
        System.out.println("Employee salary " + amount + " Manat increased");
    }

    @Override
    public void showInfos() {
        // long way and bad way
        // System.out.println("Information");
        // System.out.println("Name: " + getName());
        // System.out.println("Department: " + getDepartment());
        // System.out.println("Salary: " + getSalary());

        // short way and good way
        super.showInfos();
        System.out.println("Num of employes: " + num_of_employees);

    }

}
