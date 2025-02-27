package com.functionalInterfaceHealthcare.service;

@FunctionalInterface
public interface BillingService {

    // only one method implement cause of functional interface.
   int payment(int bill,int totalBill);
}

