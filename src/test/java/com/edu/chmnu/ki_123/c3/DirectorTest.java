package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    @Test
    void calculateSalaryTest(){
        List<Worker> workers = new ArrayList<>();

        Worker worker = new Worker("Michael Johnson", LocalDate.of(1986, 5, 20), 10, 15000);
        Director director = new Director("Akim Avasinyan", LocalDate.of(1989, 9, 4), 15, 50000, 4, 1000000);
        Manager manager = new Manager("Acyam Avasinyan", LocalDate.of(1998, 6, 19), 15, 20000, 4);
        Accountant accountant = new Accountant("Ivan Petrov", LocalDate.of(1989, 6, 7), 20, 25000, "Accountant", "Middle Accountant");

        workers.add(worker);
        workers.add(director);
        workers.add(manager);
        workers.add(accountant);

        director.addSalary(workers, 5000);

        assertEquals(130000.0, accountant.calculateTotalSalary(workers));
    }


}