package com.example.demo.Entities;


import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

    @Column(name="name")
    String name;

    @Column(name="email")
    String email;

    @Column(name="address")
    String address;

    @Column(name="p_name")
    String p_name;

    @Column(name="status")
    String status="active";

    public order(){

    }

    public order(Long id, String name, String email, String address, String p_name, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.p_name = p_name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", p_name='" + p_name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
