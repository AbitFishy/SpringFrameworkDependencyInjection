package org.genspark.spring.framework.context.assignmentXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public String getCity() {
        return city;
    }
    public void setCity(@Value("Hartford") String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(@Value("USA") String country) {
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

    public void setState(@Value("CT") String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(@Value("90210") String zipcode) {
        this.zipcode = zipcode;
    }
}
