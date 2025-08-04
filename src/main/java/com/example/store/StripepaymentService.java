package com.example.store;

import java.sql.SQLOutput;

public class StripepaymentService implements PaymentService {
    @Override
    public void processPayment(double amount)
    {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
