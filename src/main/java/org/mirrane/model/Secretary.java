package org.mirrane.model;

import java.util.Objects;

public class Secretary {
    private String cin;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private Integer phoneNumber;

    public Secretary() {
    }

    public Secretary(String cin, String firstName, String lastName) {
        this.cin = cin;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Secretary(String cin, String firstName, String lastName,
                     String email, String password, String address, Integer phoneNumber) {
        this.cin = cin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Secretary that = (Secretary) o;
        return Objects.equals(cin, that.cin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin);
    }
}
