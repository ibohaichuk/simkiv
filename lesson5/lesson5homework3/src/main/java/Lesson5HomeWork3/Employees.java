package Lesson5HomeWork3;

import java.util.Scanner;

public class Employees {
    static void printEmployees(Employee[] employees){
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println();
    }

    static void printEmployeesOfDepartment(Employee[] employees){
        Scanner scanner = new Scanner(System.in);
        String dep = scanner.nextLine();

        for (Employee e : employees) {
            if (e.getDepartment().toString().equals(dep)) {
                System.out.println(e);
            }
        }
        System.out.println();
    }

    static void sortAscendingBySalary(Employee employees[]) {
        for (int a = 0; a < employees.length - 1; a++) {
            for (int b = 1; b < employees.length; b++) {
                if (employees[b].getSalary() < employees[b - 1].getSalary()) {
                    Employee temp = employees[b - 1];
                    employees[b - 1] = employees[b];
                    employees[b] = temp;
                }
            }
        }
    }

    static void sortDescendingBySalary(Employee[] employees) {
        for (int a = 0; a < employees.length - 1; a++) {
            for (int b = 1; b < employees.length; b++) {
                if (employees[b].getSalary() > employees[b - 1].getSalary()) {
                    Employee temp = employees[b - 1];
                    employees[b - 1] = employees[b];
                    employees[b] = temp;
                }
            }
        }
    }
}