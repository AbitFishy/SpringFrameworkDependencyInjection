package org.genspark.spring.framework.context.assignmentXML;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.springframework.beans.factory.annotation.Value")
public class AppConfig {

    @Bean
    public Student getStudent(){
        return new Student();
    }

    @Bean("phoneList")
    List<Phone> listPhones(){
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone());

    }
}
