package com.efraim;

import java.util.Scanner;
public class Main {

    public Main(){
            System.out.println("Hello! Let's find out what your Space Alien Villain-name is!");
            createNewName(createNewPerson());
    }

    private Person createNewPerson(){
        Scanner scan = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = scan.nextLine();

        System.out.println("Last name: ");
        String lastName = scan.nextLine();

        System.out.println("Birth month number: ");
        int birthMonth = scan.nextInt();

        System.out.println("Birth date: ");
        int birthDate = scan.nextInt();

        Person person = new Person(firstName, lastName, birthMonth, birthDate);

        return person;
    }

    private void createNewName(Person person){
        StringBuilder myStringBuilder = new StringBuilder();

        myStringBuilder.append(generateFirstName(person.getFirstName()));

        System.out.println("Your Space Alien Villain-name is " + myStringBuilder.toString() + "!");
    }

    public String generateFirstName(String firstName){
        String generatedName = "";
        switch (firstName.charAt(0)){
            case 'A':
                generatedName =  "Mystic";
                break;
                //TODO B-D
            case 'E':
                generatedName = "Goddess";
                break;
                //TODO F-Ö
            default:
                generatedName = "Dragon";
        }
        return generatedName;
    }

    public static void main(String[] args) {
       new Main();
    }
}
