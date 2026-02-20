package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz index " + index);
        } else {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Index " + index + " dolu.");
            }
        }
    }

    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0); // Negatifse 0 yapar
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGiro() { return giro; }
    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", devs=" + Arrays.toString(developerNames) + "}";
    }
}