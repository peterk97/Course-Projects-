package com.learncoding;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // set methods !
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    // get methods !
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // isTeen method and getFullName !
    public boolean isTeen() {
        if (age <= 12 || age >= 20) {
            return false;
        }
        return true;
    }

    public String getFullName() {
        if (getLastName().isEmpty()) {
            return firstName;
        } else if (getFirstName().isEmpty()) {
            return lastName;
        }
       return firstName + " " + lastName;
    }
}