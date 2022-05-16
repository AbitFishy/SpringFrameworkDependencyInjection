package org.genspark.spring.framework.context.assignmentJavaSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {

    private String city;

    private String state;

    private String country;

    private String zipcode;
    public Address(){}

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }
    public void setCity( String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry( String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState( String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}