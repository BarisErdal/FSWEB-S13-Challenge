package org.example.enums;

public enum Plan {
    BASIC("BASIC", 1000),
    PREMIUM("PREMIUM", 3000),
    VIP("VIP", 5000);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}