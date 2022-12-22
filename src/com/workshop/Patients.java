package com.workshop;

import java.util.Scanner;
//Writing problem for Patients

public class Patients {
private String name;
private double phoneNumber;
private String city;
private String state;
private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        //System.out.println("Enter the phone number");
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "name='" + name + '\'' +
                ", phonenumber=" + phoneNumber +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Patients(String name, double phoneNumber, String city, String state, String department) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department = department;
    }

    public Patients() {
    }
}
