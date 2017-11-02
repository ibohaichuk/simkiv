package lesson4homework;

/*
I. Create Console Application project in Java.
II. Add class Employee to the project.
III. Class Employee should consists of
	1) three private fields: name, rate and hours;
	2) static field totalHours
	3) properties for access to these fields;
	4) default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
    5) methods:
        a) calcSalary - to calculate the salary of person (rate * hours)
        b) toString - to output information about employee
        c) changeRate - to change the rate of employee
        d) calcBonuses – to calculate % from salary
IV. In the method main() create 3 objects of Employee type. Input information about them.
V. Display the total hours of all workers to screen
*/

public class App
{
    public static void main( String[] args )
    {
        Employee employee1 = new Employee("Vasia", 5,160);

        Employee employee2 = new Employee("Petro", 6.5);
        employee2.setHours(200);

        Employee employee3 = new Employee();
        employee3.setName("Leonid");
        employee3.setRate(3);
        employee3.setHours(166);

        System.out.println("Total hours of all employees is: " + Employee.getTotalHours());

        /*
        My tasks.
        1) Test methods changeRate(double rate) and changeRate()
        Print whole info (name, rate, hours, salary, bonuses) about all employees
         */

        employee2.changeRate(8.2);
        employee3.changeRate();

        System.out.println(employee1.toString() +
                ", salary: " + employee1.calcSalary(employee1.getRate(),employee1.getHours()) +
                ", bonuses: " + employee1.calcBonuses(employee1.getRate(),employee1.getHours()));
        System.out.println(employee2.toString() +
                ", salary: " + employee2.calcSalary(employee2.getRate(),employee2.getHours()) +
                ", bonuses: " + employee2.calcBonuses(employee2.getRate(),employee2.getHours()));

        System.out.println(employee3.toString() +
                ", salary: " + employee3.calcSalary(employee3.getRate(),employee3.getHours()) +
                ", bonuses: " + employee3.calcBonuses(employee3.getRate(),employee3.getHours()));
    }
}
