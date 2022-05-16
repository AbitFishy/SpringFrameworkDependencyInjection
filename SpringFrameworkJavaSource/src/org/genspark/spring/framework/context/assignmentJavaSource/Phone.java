package org.genspark.spring.framework.context.assignmentJavaSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Phone {

    public Phone(){
    }

    public Phone(String number){
        mob = number;
    }

    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob( String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
