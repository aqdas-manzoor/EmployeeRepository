package com.model;

public class Address {

    private String street;
    private String addressType;
    private String city;
    private String state;
    private int zipCode;
    private String number;


    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getAddressType() {
        return addressType;
    }

    public String getNumber() {
        return number;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


}

