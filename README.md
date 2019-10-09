# Strategy Pattern
### Type
The Strategy Pattern is **a behavioral pattern**.
### Description
The strategy design pattern gives you the ability to *define a family of algorithms, put each of them in a separate class, and make their objects interchangeable*.
###Problem
```java
class ShoppingCart {
    
    public void payUsingPayPal(String username, String password) {
        // Implementation
    }
    
    public void payUsingBancontact(String pinCode) {
        // Implementation
    }

   // ...
}
```
###Solution
```java
interface PaymentStrategy {
    void pay(double amount);
}

class PayPalPaymentStrategy implements PaymentStrategy {
    
    @Override
    public void pay(double amount) {
        // Implementation
    }
}

class ShoppingCart {
    
    // PayPalPaymentStrategy
    // BancontactPaymentStrategy
    // ...

    public void pay(PayPalPaymentStrategy strategy) {
        strategy.pay(1234);
    }
}
```

### Use
1. When you need to have x types of functions that have the same primary goal but behave differently.
### Prevent
1. From creating x types of different functions that have the same goal.
### References
1. https://refactoring.guru/design-patterns/strategy
