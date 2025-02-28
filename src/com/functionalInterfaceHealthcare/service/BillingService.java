package com.functionalInterfaceHealthcare.service;

import com.functionalInterfaceHealthcare.model.Billing;

@FunctionalInterface
public interface BillingService {

    // only one method implement cause of functional interface.
   int payment(int bill,int totalBill);
}

