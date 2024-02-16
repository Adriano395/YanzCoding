/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activities;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Activity_1 {
    public static void main (String[]args){
         Scanner scn = new Scanner(System.in);
        int age;
        String firstName;
        String middleinitial;
        String lastName;
        String birthday;
        String gender;
        String address;

        System.out.println("Lastname: ");
        lastName= scn.nextLine();
        System.out.println("Firstname: ");
        firstName = scn.nextLine();
        System.out.println("Middleinitial: ");
        middleinitial = scn.nextLine();
        System.out.println("Gender (Male,Female,Racecar,etc.): ");
        gender = scn.nextLine();
        System.out.println("Address(City only):");
        address = scn.nextLine();
        System.out.println("Birthdate (input complete date):");
        birthday = scn.nextLine();
        System.out.println(" Your Age: ");
        age = scn.nextInt();
        
        System.out.println();
        
        String FirstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String Middleinitial = middleinitial.substring(0,1).toUpperCase();
        String Lastname = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String Gender = gender.substring(0,1).toUpperCase()+gender.substring(1);
        String Address = address.substring(0,1).toUpperCase()+address.substring(1);

        System.out.println("Name: "+ FirstName + " " + Middleinitial+ ". "+ Lastname);
        System.out.println("Age: " + age);
        System.out.println("Birthdate: " + birthday);       
        System.out.println("Gender: "+ Gender);
        System.out.println("Address: " + Address);
        
        scn.close(); 
    }
    
}
