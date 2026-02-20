package org.example.enums;

public enum Plan {
    BASIC("BASIC PLAN", 1000),
    PREMIUM("PREMIUM PLAN", 5000),
    VIP("VIP PLAN", 10000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}