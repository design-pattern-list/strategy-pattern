package com.michielswaanen.strategies;

public class PayPalPaymentStrategy implements PaymentStrategy {

    private String username;
    private String password;

    public PayPalPaymentStrategy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        if(validateLoginCredentials())
            System.out.println("[PayPal] " + amount + " euro successfully payed!");
    }

    private boolean validateLoginCredentials() {
        System.out.println("[PayPal] Login credentials email: '" + this.username + "' & password: '" + this.password + "' validated successfully!");
        return true;
    }
}
