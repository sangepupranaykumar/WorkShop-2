package com.workshop;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {
    Scanner scanner = new Scanner(System.in);
    Patients information = new Patients();//default constructor
    ArrayList<Patients> informationList = new ArrayList<Patients>();
    public void addPatient() {
        System.out.println("Enter the First name ");
        information.setName(scanner.next());
        System.out.println("enter the phone number ");
        information.setPhoneNumber(scanner.nextDouble());
        System.out.println("Enter the city ");
        information.setCity(scanner.next());
        System.out.println(" Enter the state ");
        information.setState(scanner.next());
        System.out.println("Enter the Department ");
        information.setDepartment(scanner.next());
        //Parameterised constructor
        Patients patient = new Patients(information.getName(),information.getPhoneNumber(),information.getCity(),information.getState(),information.getDepartment());
        informationList.add(patient);
    }

    public void showInformation() {
        System.out.println(informationList);
    }


    public static void main(String[] args) {
        HospitalManagement obj = new HospitalManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of patients");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            obj.addPatient();
        }
        obj.showInformation();
    }
}
