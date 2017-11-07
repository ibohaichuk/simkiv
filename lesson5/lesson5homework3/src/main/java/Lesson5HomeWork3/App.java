package Lesson5HomeWork3;

/*
1) create a class Employee with fields name, department, salary.
    => class Employee
2) declare enum with department names. Create array with five objects of class Employee.
    => enum Departments
3) display all employees of a certain department (enter department name in the console);
    => class Employees => method printEmployeesOfDepartment()
4) arrange workers by the field salary in the ascending and descending order.
    => class Employees => methods sortAscendingBySalary() and sortDescendingBySalary()
*/


import static Lesson5HomeWork3.Employees.*;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Pedro1", Departments.ECONOMIC, 6100);
        employees[1] = new Employee("Juanita2", Departments.LEGAL, 2200);
        employees[2] = new Employee("Francesca3", Departments.SALES, 5300);
        employees[3] = new Employee("Mario4", Departments.ECONOMIC, 4400);
        employees[4] = new Employee("Violetta5", Departments.SALES, 5500);

        System.out.println("Initial array:");
        printEmployees(employees);

        System.out.println("Enter the name of department(ECONOMIC, LEGAL, SALES): ");
        printEmployeesOfDepartment(employees);

        sortAscendingBySalary(employees);
        System.out.println("Employees sorted by salary in ascending order");
        printEmployees(employees);

        sortDescendingBySalary(employees);
        System.out.println("Employees sorted by salary in descending order");
        printEmployees(employees);
    }
}
