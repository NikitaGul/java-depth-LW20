package com.edu.chmnu.ki_123.c3;

import java.time.LocalDate;
import java.time.Period;

public class Worker {
    private String fullName;
    private LocalDate birthDate;
    private int workExperience;
    private double salary;

    public Worker(String fullName, LocalDate birthDate, int workExperience, double salary) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker: " + fullName + "\n" +
                "Birth day: " + birthDate + "\n" +
                "Age: " + getAge() + " \n" +
                "Work experience: " + workExperience + " years\n" +
                "Salary: " + salary + " $";
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getFullName(){
        return this.fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}
