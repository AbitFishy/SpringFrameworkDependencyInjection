package org.genspark.spring.framework.context.assignmentJavaSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


public class Student {
    public Student() {
    }

    public Student(int id, String name, List<Phone> ph, Address address) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", address=" + address +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId( int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName( String name) {
        this.name = name;
    }
/*    public List<Phone> getPhoneNumbers() {
        return ph;
    }
    @Autowired
    public void setPhoneNumbers(List<Phone> phoneNumbers) {
        this.ph = phoneNumbers;
    }
    public Address getAddress() {
        return add;
    }*/


    private int id;

    private String name;

    private List<Phone> ph;

    private Address address;

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

}
