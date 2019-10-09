package com.michielswaanen.objects;

import com.michielswaanen.strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<ShopItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(ShopItem item) {
        this.items.add(item);
    }

    public void removeItem(ShopItem item) {
        this.items.remove(item);
    }

    public void pay(PaymentStrategy paymentMethod) {
        double total = calculateTotal();
        paymentMethod.pay(total);
    }

    private double calculateTotal() {
        double total = 0;

        for (ShopItem item : this.items)
            total += item.getPrice();

        return total;
    }
}
