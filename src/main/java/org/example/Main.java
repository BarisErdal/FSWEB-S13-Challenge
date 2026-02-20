package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {
        // 1. Healthplan Test
        Healthplan h1 = new Healthplan(1, "Axa Sigorta", Plan.BASIC);
        System.out.println(h1.toString());

        // 2. Employee Test
        String[] plans = new String[2];
        Employee emp = new Employee(101, "Ali Veli", "ali@test.com", "1234", plans);
        emp.addHealthplan(0, "Axa Sigorta");
        emp.addHealthplan(0, "Ziraat Sigorta"); // Dolu uyarısı verecek
        emp.addHealthplan(5, "Hatalı Plan");   // Index hatası verecek
        System.out.println(emp.toString());

        // 3. Company Test
        String[] devs = new String[3];
        Company comp = new Company(1, "Tech Corp", -500.0, devs); // Negatif ciro testi
        comp.addEmployee(0, "Ali Veli");
        System.out.println(comp.toString());
    }
}