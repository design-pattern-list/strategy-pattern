package com.michielswaanen.strategies;

public class PaysafeCardPaymentStrategy implements PaymentStrategy {

    private String uniqueCode;

    public PaysafeCardPaymentStrategy(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    @Override
    public void pay(double amount) {
        if(isValidCode())
            System.out.println("[Paysafe Card] " + amount + " euro successfully payed!");
    }

    private boolean isValidCode() {
        // Validation Code
        System.out.println("[Paysafe Card] Unique code '" + this.uniqueCode + "' validated successfully!");
        return true;
    }
}
