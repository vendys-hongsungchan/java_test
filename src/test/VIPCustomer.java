package test;

public class VIPCustomer extends Customer{

    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.01;
        super.setBonusPoint(1000);

        System.out.println("VIP Customer 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
