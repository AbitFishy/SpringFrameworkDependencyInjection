package org.genspark.spring.framework.context.assignmentXML;

import java.util.List;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumbers=" + ph +
                ", address=" + add +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Phone> getPhoneNumbers() {
        return ph;
    }
    public void setPhoneNumbers(List<Phone> phoneNumbers) {
        this.ph = phoneNumbers;
    }
    public Address getAddress() {
        return add;
    }
    public void setAddress(Address address) {
        this.add = address;
    }

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}
