package org.genspark.spring.framework.context.assignmentAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    @Value("555-564-8989")
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
