package com.edu.chmnu.ki_123.c3;

import java.time.LocalDate;
import java.util.List;

public final class Manager extends Worker {
    private final int teamSize;

    public Manager(String fullName, LocalDate birthDate, int workExperience, double salary, int teamSize) {
        super(fullName, birthDate, workExperience, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Team size: " + teamSize;
    }

    public double calcBenefits(List<Worker> workers, Accountant accountant, Director director){
        double sum = accountant.calculateTotalSalary(workers);
        return director.getBudget() - sum;
    }

    public void calcBenefitsAll(List<Worker> workers, Accountant accountant, Director director){
        double benefit = calcBenefits(workers, accountant, director);
        System.out.println("The benefits : " + benefit);
    }

    public int getTeamSize() {
        return teamSize;
    }
}
