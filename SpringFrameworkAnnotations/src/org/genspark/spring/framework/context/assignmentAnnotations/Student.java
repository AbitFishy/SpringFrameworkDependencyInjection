package org.genspark.spring.framework.context.assignmentAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
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

    @Value("37999")
    private int id;
    @Value("John Doe")
    private String name;
    @Autowired
    @Value("#{{" +
            "new org.genspark.spring.framework.context.assignmentAnnotations.Phone('123-856-8965')," +
            "new org.genspark.spring.framework.context.assignmentAnnotations.Phone('185-456-8755')," +
            "new org.genspark.spring.framework.context.assignmentAnnotations.Phone('123-856-8965')" +
            "}}")

    private List<Phone> ph;
    @Autowired
    private Address address;

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

}
