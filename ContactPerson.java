package com.bridgelabz.assignmentsrfp259.day09.addressbook;

public class ContactPerson {
    private String firstName, lastName, email, address, city, state;
    private int zip;
    private long mobile;

    public ContactPerson() {
    }

    public ContactPerson(String firstName, String lastName, String email, String address, String city, String state, int zip, long mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", mobile=" + mobile +
                '}';
    }
}
