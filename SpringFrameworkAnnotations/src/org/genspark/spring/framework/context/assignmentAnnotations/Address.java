package org.genspark.spring.framework.context.assignmentAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("Hartford")
    private String city;
    @Value("CT")
    private String state;
    @Value("USA")
    private String country;
    @Value("90210")
    private String zipcode;

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
