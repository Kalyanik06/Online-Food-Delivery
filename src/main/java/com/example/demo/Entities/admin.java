package com.example.demo.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class admin {

    @Column(name="firstname")
    String firstname;

    @Column(name="lastname")
    String lastname;

    @Column(name="contactno")
    String contactno;

    @Id
    @Column(name="email")
    String email;

    @Column(name="password")
    String password;


    public admin(){

    }

    public admin(String firstname, String lastname, String contactno, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactno = contactno;
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
        return "admin{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactno='" + contactno + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
