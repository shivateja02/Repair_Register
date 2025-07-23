package com.car.model;

public class CarDetails {
    private int customerId;
    private String name, carNo, carBrand, carIssue, address, contact;

    // Getters and setters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCarNo() { return carNo; }
    public void setCarNo(String carNo) { this.carNo = carNo; }

    public String getCarBrand() { return carBrand; }
    public void setCarBrand(String carBrand) { this.carBrand = carBrand; }

    public String getCarIssue() { return carIssue; }
    public void setCarIssue(String carIssue) { this.carIssue = carIssue; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
