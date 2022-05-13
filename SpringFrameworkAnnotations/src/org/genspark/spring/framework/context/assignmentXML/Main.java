package org.genspark.spring.framework.context.assignmentXML;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //use the student, phone and address classes to demonstrate DI
        // using all three types of Spring Container configurations(XML, Annotation and Java Config
        try{
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
            Student stu = (Student) context.getBean("student");
            System.out.println(stu);
        }
        catch (BeansException be){
            be.printStackTrace();
        }
    }
}