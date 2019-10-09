package com.michielswaanen.strategies;

public class BancontactPaymentStrategy implements PaymentStrategy {

    private String pinCode;

    public BancontactPaymentStrategy(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public void pay(double amount) {
        if(validateCode())
            System.out.println("[Bancontact] " + amount + " euro successfully payed!");
    }

    private boolean validateCode() {
        System.out.println("[Bancontact] Pin code '" + this.pinCode + "' validated successfully!");
        return true;
    }
}
