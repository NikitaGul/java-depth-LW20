package com.edu.chmnu.ki_123.c3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Ivan Petrov", LocalDate.of(1985, 5, 20), 10, 15000);
        Manager manager = new Manager("Petro Kojemyaka", LocalDate.of(1980, 3, 15), 15, 25000, 5);
        Director director = new Director("Olena Velika", LocalDate.of(1975, 1, 10), 20, 50000, 10, 1000000);
        Accountant accountant = new Accountant("Maria Stepanenko", LocalDate.of(1990, 6, 25), 8, 18000,
                "Main accountant", "Senior Accountant");

        System.out.println(worker);
        System.out.println("--------------------");
        System.out.println(manager);
        System.out.println("--------------------");
        System.out.println(director);
        System.out.println("--------------------");
        System.out.println(accountant);

        List<Worker> workers = new ArrayList<>();
        workers.add(worker);
        workers.add(accountant);
        workers.add(director);
        workers.add(manager);

        accountant.calcSalary(workers);
        manager.calcBenefitsAll(workers, accountant, director);

        director.addSalary(workers, 5000);
        accountant.calcSalary(workers);
    }
}
