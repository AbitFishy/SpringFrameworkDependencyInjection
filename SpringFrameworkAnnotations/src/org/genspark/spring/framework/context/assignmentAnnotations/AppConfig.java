package org.genspark.spring.framework.context.assignmentAnnotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.genspark.spring.framework.context.assignmentAnnotations")
public class AppConfig {

/*    @Bean
    public Student getStudent(){
        return new Student();
    }*/

/*    @Bean("phoneList")
    List<Phone> listPhones(){
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone());
        return phones;
    }*/
}
