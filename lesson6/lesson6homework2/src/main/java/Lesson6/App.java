package Lesson6;
/*
1) Create:
 a) an interface to the method calculatePay(),
 b) the base class Employee with a string variable employeeId.
 c) two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
2) Describe:
 1) hourly paid workers in the relevant classes (one of the children),
 2) fixed paid workers (second child),
 3) the string variable socialSecurityNumber in the class SalariedEmployee .
 4) federalTaxIdMember in the class of contractEmployee .
The calculation formula for the "time-worker“ is:
    "the average monthly salary = hourly rate * number of hours worked"
For employees with a fixed payment the formula is:
    "the average monthly salary = fixed monthly payment“
3) Create an array of employees and add the employees with different form of payment.
4) Arrange the entire sequence of workers descending the average monthly wage.
5) Output the employee ID, name, and the average monthly wage for all elements of the list.
 */
public class App 
{
    public static void main( String[] args ){
        Employee[] employees = new Employee[4];

        employees[0] = new ContractEmployee("0001", "AA 123456" );
        employees[1] = new SalariedEmployee("0002", "123 456 789");
        employees[2] = new SalariedEmployee("0003", "987 654 321");
        employees[3] = new ContractEmployee("0004", "ZZ 321654");

        for (Employee e: employees) {
            if (e instanceof ContractEmployee) {
                int salaryCE = ((ContractEmployee) e).calcPay();
                System.out.println("ID: " + e.employeeId + "; federal tax ID: " +
                        ((ContractEmployee) e).getFederalTaxIdMember() + "; salary: " + salaryCE);
            }else{
                int salarySE = ((SalariedEmployee) e).calcPay();
                System.out.println("ID: " + e.employeeId + "; social security #: " +
                        ((SalariedEmployee)e).getSocialSecurityNumber() + "; salary: " + salarySE);
            }
        }
    }
}
