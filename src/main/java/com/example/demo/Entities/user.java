package com.example.demo.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class user {

    @Column(name="firstname")
    String firstname;

    @Column(name="lastname")
    String lastname;

    @Column(name="contactno")
    String contactno;

    @Column(name="address")
    String address;

    @Id
    @Column(name="email")
    String email;

    @Column(name="password")
    String password;


    public user(){

    }

    public user(String firstname, String lastname, String contactno, String address, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactno = contactno;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "user{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactno='" + contactno + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
