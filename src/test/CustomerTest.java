package test;

import test.Customer;
import test.VIPCustomer;

public interface CustomerTest {

    public static void main(String[] args) {

        // Customer customerA = new Customer();
        // customerA.setCustomerID(10100);
        // customerA.setCustomerName("A");

        Customer customerB = new VIPCustomer(10101, "B");
        // customerB.setCustomerID(10101);
        // customerB.setCustomerName("B");
        customerB.bonusPoint = 1000;

        // System.out.println(customerA.showCustomerInfo());
        System.out.println(customerB.showCustomerInfo());
    }
}
