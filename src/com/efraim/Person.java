package com.efraim;

public class Person {
    private String firstName;
    private String lastName;
    private int birthday;
    private int birthMonth;

    Person(String firstName, String lastName, int birthMonth, int birthday){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthMonth() {
        return birthMonth;
    }
}
