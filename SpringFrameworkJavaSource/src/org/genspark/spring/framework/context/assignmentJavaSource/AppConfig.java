package org.genspark.spring.framework.context.assignmentJavaSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("student")
    public Student getStudent(List<Phone> ph, Address address){
        return new Student(548652, "John Doe", ph, address);
    }

    @Bean("ph")
    List<Phone> listPhones(){
        System.out.println("In ListPhones()");
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone());
        phones.add(new Phone("548-985-9855"));
        return phones;
    }

    @Bean("phone")
    public Phone getPhone(){
        System.out.println("In getPhone()");
        Phone p = new Phone("123-456-7890");
        return p;
    }

    @Bean("phone")
    public Phone getPhone2(String number){
        System.out.println("In getPhone2()");
        return new Phone(number);
    }

    @Bean("address")
    public Address getAddress() {
        return new Address("Hartford", "CT", "USA", "095844");
    }
}
