package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        performOperations();
    }

    public static void performOperations() {
        // Obje Oluşturma
        Healthplan hp = new Healthplan(1, "Basic Sigorta", Plan.BASIC);

        String[] plans = new String[2];
        Employee emp = new Employee(1, "John Doe", "john@test.com", "1234", plans);
        emp.addHealthPlan(0, hp.getName());

        String[] devs = new String[2];
        Company comp = new Company(1, "Workintech", 15000.5, devs);
        comp.addEmployee(0, emp.getFullName());

        // Çıktılar
        System.out.println("--- Sınıf Bilgileri ---");
        System.out.println(hp.toString());
        System.out.println(emp.toString());
        System.out.println(comp.toString());
    }
}