package org.example;

public class Contact {
    String id;
    String phoneNumber;
    String firstName;
    String lastName;

    public Contact(String id, String phoneNumber, String firstName, String lastName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public java.lang.String getId() {
        return id;
    }

    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }
}