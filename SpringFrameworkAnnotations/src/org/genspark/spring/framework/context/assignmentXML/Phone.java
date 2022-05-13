package org.genspark.spring.framework.context.assignmentXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(@Value("555-564-8989") String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
