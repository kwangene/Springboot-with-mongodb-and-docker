package com.mongo.mongodb.model;

public class Address {
    private String country;
    private int postCode;
    private String city;

    public Address() {
    }
    public Address(String country, int postCode, String city) {
        this.country = country;
        this.postCode = postCode;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", postCode=" + postCode +
                ", city='" + city + '\'' +
                '}';
    }
}
