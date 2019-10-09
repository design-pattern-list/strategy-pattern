package com.michielswaanen.objects;

public class ShopItem {

    private String name;
    private double price;

    public ShopItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
