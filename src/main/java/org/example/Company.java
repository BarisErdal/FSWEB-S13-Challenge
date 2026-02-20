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
        setGiro(giro); // Negatif kontrolü için setter kullanıldı
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Index " + index + " dolu, atama yapılamadı.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: " + index + " dizin sınırları dışında.");
        }
    }

    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        this.giro = Math.max(giro, 0); // 0'dan küçükse 0 yapar
    }

    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", devs=" + Arrays.toString(developerNames) + "}";
    }
}