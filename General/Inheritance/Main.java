package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Employee employee = new Employee("Farid", "Software", 2000);
        Manager manager = new Manager("Farid", "Software", 2000, 10);
        // manager.showInfos();
        // manager.increaseAmount(100);

        System.out.println(manager);

        // polymorphism
        Employee employee = new Manager("Farid", "Software", 2000, 12);
        employee.showInfos();
        System.out.println(employee);
    }
}
