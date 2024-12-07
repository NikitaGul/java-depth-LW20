package com.edu.chmnu.ki_123.c3;

import java.time.LocalDate;
import java.util.List;

public final class Director extends Worker {
    private double budget;

    public Director(String fullName, LocalDate birthDate, int workExperience, double salary, int teamSize, double budget) {
        super(fullName, birthDate, workExperience, salary);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Budget: " + budget + " $";
    }

    public void addSalary(List<Worker> workers, double sum){
        for (Worker worker : workers) {
            double biggerSalary = worker.getSalary() + sum;
            worker.setSalary(biggerSalary);
        }
    }

    public double getBudget(){
        return this.budget;
    }
    public void setBudget(double sum){
        this.budget = budget;
    }
}
