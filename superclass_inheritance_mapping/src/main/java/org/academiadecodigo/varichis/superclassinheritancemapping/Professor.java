package org.academiadecodigo.varichis.superclassinheritancemapping;

import javax.persistence.*;

@Entity(name= "professor")
public class Professor extends AbstractModel {

    private String name;
    private String graduation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
}
