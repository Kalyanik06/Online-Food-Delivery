package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="review")
public class review {

    @Id
    @Column(name="email")
    String email;

    @Column(name="name")
    String name;

    @Column(name="ureview")
    String ureview;

    public review(){

    }

    public review(String email, String name, String ureview) {
        this.email = email;
        this.name = name;
        this.ureview = ureview;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUreview() {
        return ureview;
    }

    public void setUreview(String ureview) {
        this.ureview = ureview;
    }

    @Override
    public String toString() {
        return "review{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", ureview='" + ureview + '\'' +
                '}';
    }


}
