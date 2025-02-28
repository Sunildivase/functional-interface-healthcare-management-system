package com.functionalInterfaceHealthcare.service;




public class PaymentService implements BillingService{

    // implement of functional interface with only one method.
    public int payment(int bill,int totalBill) {
        int calculatedPayment = bill + totalBill;
        System.out.println("total generated bill: "+calculatedPayment);
        return calculatedPayment;
    }
}
