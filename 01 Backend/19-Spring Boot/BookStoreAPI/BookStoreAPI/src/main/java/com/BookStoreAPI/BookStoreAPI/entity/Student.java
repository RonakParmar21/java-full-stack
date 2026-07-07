package com.BookStoreAPI.BookStoreAPI.entity;

public class Student {
    private Long id;
    private String name;
    private String email;
    private Double mobileNo;

    public Student() {
    }

    public Student(Long id, String name, String email, Double mobileNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
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

    public Double getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Double mobileNo) {
        this.mobileNo = mobileNo;
    }
}
