package lesson4homework;

import java.util.Scanner;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    private static double totalHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
        totalHours += hours;
    }

    public static double getTotalHours() {
        return totalHours;
    }

    public static void setTotalHours(double totalHours) {
        Employee.totalHours = totalHours;
    }

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours += hours;
    }

    public double calcSalary(double rate, double hours){
        return (rate*hours);
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                ", rate: " + rate +
                ", hours: " + hours;
    }

    public void changeRate (double rate){
        this.rate = rate;
    }

    public void changeRate (){
        System.out.println("Enter new rate, please: ");
        Scanner scanner = new Scanner(System.in);
        rate = scanner.nextDouble();
    }

    public double calcBonuses(double rate, double hours){
        double bonusPercent = 0.1;
        return (bonusPercent*rate*hours);
    }
}
