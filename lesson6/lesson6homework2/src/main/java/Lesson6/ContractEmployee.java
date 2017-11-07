package Lesson6;

public class ContractEmployee extends Employee implements IPay {
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String federalTaxIdMember) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int calcPay() {
        return 2500;
    }
}
