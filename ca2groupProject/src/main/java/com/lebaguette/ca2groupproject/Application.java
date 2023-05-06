/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lebaguette.ca2groupproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author leoze
 */
public class Application {

    public static void main(String[] args) {
        MenuOptions menu = new MenuOptions();

        //hashmap object?
        hashmap practice = new hashmap();
        Scanner kb = new Scanner(System.in);

        int choice = -1;
        //case 6 will be the reading patient file
        //and writing to a file the data
        //and then the program will end, so 
        //the writing will be done before program closes
        do {
            menu.menu();
            try {
                choice = kb.nextInt();

                switch (choice) {
                    case 1:
                        //add patient
                        break;
                    case 2:
                        //delete patient
                        break;
                    case 3:
                        //display all patients
                        break;
                    case 4:
                        //create new appointment for patient
                        break;
                    case 5:
                        //call next patient in
                        break;
                    case 6:
                   try {
                        File input = new File("patients.txt");
                        Scanner KB = new Scanner(input);

                        while (KB.hasNextLine()) {
                            String line = KB.nextLine();
                            String[] values = line.split(",");
                            String FirstName = values[0];
                            String LastName = values[1];
                            LocalDate dob = LocalDate.parse(values[3]);
                            LocalDate joinedDate = LocalDate.parse(values[4]);
                            //need to add to like a hospital practice? gp?
                            Patient patient = new Patient(FirstName, LastName, dob, joinedDate);

                            //here
                        }
                        KB.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("File was not found");
                    }

                    try {
                        File input = new File("output.txt");
                        PrintWriter filewrite = new PrintWriter(input);

                        for (Patient patient
                                : // get from the hospital practice) 
                                 {
                            filewrite.println(patient.getFirstName() + " , " + patient.getLastName() + " , " + patient.getDateOfBirth().toString() + " , " + patient.getDateJoined().toString());
                        }
                        filewrite.close();

                    } catch (FileNotFoundException e) {
                        System.out.println("File not found");
                    }

                    System.out.println("Exiting System");
                    return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a number for one of the options");
                kb.next();
            }
        } while (choice != 6);
    }

}