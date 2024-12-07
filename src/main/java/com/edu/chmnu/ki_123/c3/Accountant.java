package com.edu.chmnu.ki_123.c3;

import java.time.LocalDate;
import java.util.List;

public final class Accountant extends Worker {
    private final String accountingField;
    private final String qualificationLevel;

    public Accountant(String fullName, LocalDate birthDate, int workExperience, double salary,
                      String accountingField, String qualificationLevel) {
        super(fullName, birthDate, workExperience, salary);
        this.accountingField = accountingField;
        this.qualificationLevel = qualificationLevel;
    }

    public double calculateBonus() {
        return getWorkExperience() * 500;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Sphere: " + accountingField + "\n" +
                "Qualification Level : " + qualificationLevel + "\n" +
                "Bonus : " + calculateBonus() + " $";
    }

    public double calculateTotalSalary(List<Worker> workers) {
        double totalSalary = 0;
        for (Worker worker : workers) {
            totalSalary += worker.getSalary();
        }
        return totalSalary;
    }

    public void calcSalary(List<Worker> workers){
        double salary = calculateTotalSalary(workers);
        System.out.println("Sum salary is " + salary);

    }

    public String getAccountingField() {
        return accountingField;
    }

    public String getQualificationLevel() {
        return qualificationLevel;
    }
}
