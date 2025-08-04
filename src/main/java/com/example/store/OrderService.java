package com.example.store;

public class OrderService
{
    public void placerder()
    {
        var paymentService = new StripepaymentService();
        paymentService.processPayment(10);
    }
}
