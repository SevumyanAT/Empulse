package ru.sevumyan.arsen.entity;

import java.sql.Date;

public class Employee {

    private String firstName;
    private String lastName;
    private String passportNumber;
    private String universityEducation;
    private String birthDate;
    private String bankAccount;
    private String postId;
    private String departmentId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportNumber() {
        return Integer.parseInt(passportNumber);
    }

    public String getUniversityEducation() {
        return universityEducation;
    }

    public Date getBirthDate() {
        return Date.valueOf(birthDate);
    }

    public int getBankAccount() {
        return Integer.parseInt(bankAccount);
    }

    public int getPostId() {
        return Integer.parseInt(postId);
    }

    public int getDepartmentId() {
        return Integer.parseInt(departmentId);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setUniversityEducation(String universityEducation) {
        this.universityEducation = universityEducation;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
