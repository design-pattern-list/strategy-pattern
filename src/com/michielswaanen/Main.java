package com.michielswaanen;

import com.michielswaanen.objects.ShopItem;
import com.michielswaanen.objects.ShoppingCart;
import com.michielswaanen.strategies.BancontactPaymentStrategy;
import com.michielswaanen.strategies.PayPalPaymentStrategy;
import com.michielswaanen.strategies.PaysafeCardPaymentStrategy;

public class Main {

    public static void main(String[] args) {

        // Initialisation
        ShopItem macBookPro = new ShopItem("MacBook Pro", 2400);
        ShopItem macBookAir = new ShopItem("MacBook Air", 1700);
        ShopItem appleWatch = new ShopItem("Apple Watch", 400);
        ShopItem airPods = new ShopItem("Air Pods", 200);

        ShoppingCart shoppingCart = new ShoppingCart();

        // Strategy Pattern Execution 1
        shoppingCart.addItem(macBookPro);
        shoppingCart.pay(new PayPalPaymentStrategy("john.doe@example.com", "password"));

        // Strategy Pattern Execution 2
        shoppingCart.addItem(appleWatch);
        shoppingCart.addItem(airPods);
        shoppingCart.pay(new BancontactPaymentStrategy("1234"));

        // Strategy Pattern Execution 3
        shoppingCart.addItem(macBookAir);
        shoppingCart.pay(new PaysafeCardPaymentStrategy("1234-1234-1234-1234"));
    }
}
