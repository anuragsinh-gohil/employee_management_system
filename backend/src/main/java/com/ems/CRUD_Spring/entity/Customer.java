package com.ems.CRUD_Spring.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String email;
    private String phone;

    // REQUIRED no-arg constructor
    public Customer() {}

    // All-args constructor (optional but recommended)
    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // EXPLICIT getters with @JsonProperty
    @JsonProperty("id")
    public Long getId() { return id; }

    @JsonProperty("name")
    public String getName() { return name; }

    @JsonProperty("email")
    public String getEmail() { return email; }

    @JsonProperty("phone")
    public String getPhone() { return phone; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }

    // toString() for debugging
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', email='%s', phone='%s']",
                id, name, email, phone
        );
    }
}