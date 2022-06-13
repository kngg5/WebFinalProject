package com.example.tryProject.models;


import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customer_name;
    private String customer_surname;
    private Long customer_phone;
    private Long order_numbers;
    private String address;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_surname() {
        return customer_surname;
    }

    public void setCustomer_surname(String customer_surname) {
        this.customer_surname = customer_surname;
    }

    public Long getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(Long customer_phone) {
        this.customer_phone = customer_phone;
    }

    public Long getOrder_numbers() {
        return order_numbers;
    }

    public void setOrder_numbers(Long order_numbers) {
        this.order_numbers = order_numbers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public OrderDetails() {
        
    }


    public OrderDetails(String customer_name, String customer_surname, Long customer_phone, Long order_numbers, String address) {
        this.customer_name = customer_name;
        this.customer_surname = customer_surname;
        this.customer_phone = customer_phone;
        this.order_numbers = order_numbers;
        this.address = address;
    }



}
