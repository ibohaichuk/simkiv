package Lesson6;

public class SalariedEmployee extends Employee implements IPay {
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int calcPay() {
        int hourlyRate = 7;
        int hours = 168 ;
        return hourlyRate * hours;
    }
}
