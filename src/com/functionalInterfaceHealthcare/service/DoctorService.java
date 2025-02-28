package com.functionalInterfaceHealthcare.service;

import com.functionalInterfaceHealthcare.model.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorService {

    private static Scanner scanner = new Scanner(System.in);

    List<Doctor> doctors = new ArrayList<>();

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public Doctor createDoctor(){
        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter firstName");
        String firstName = scanner.nextLine();

        System.out.println("please enter lastName");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact no");
        long contactNo = Long.parseLong(scanner.nextLine());

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        System.out.println("please enter experience");
        int experience = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setAge(age);
        doctor.setGender(gender);
        doctor.setContactNo(contactNo);
        doctor.setSpeciality(speciality);
        doctor.setExperience(experience);

        doctors.add(doctor);
        return doctor;
    }
    public void displayDoctor(){
        for(Doctor doctor: doctors){
            System.out.println("doctors: "+doctor);
        }

    }

    public void deleteDoctor(int doctorId){
        String deletedDoctor = String.valueOf(doctors.remove(doctorId));
        System.out.println("removed doctor: "+deletedDoctor);
    }

}
