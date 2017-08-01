package com.springHTML.springHTML;

/**
 * Created by Admin on 8/1/17.
 */
public class Student {

    // instantiate varibales
    public String firstName;
    public String lastName;


    public Student() {

    }

    Grade grade;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Grade getGrade() {
        return grade;
    }
}
