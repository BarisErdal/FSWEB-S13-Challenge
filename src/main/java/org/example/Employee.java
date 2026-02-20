package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name) {
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
                System.out.println(name + " başarıyla eklendi.");
            } else {
                System.out.println("İlgili index (" + index + ") zaten dolu.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index " + index);
        }
    }

    // Getter & Setters...
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String[] getHealthplans() { return healthplans; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + fullName + "', email='" + email + "', plans=" + Arrays.toString(healthplans) + "}";
    }
}