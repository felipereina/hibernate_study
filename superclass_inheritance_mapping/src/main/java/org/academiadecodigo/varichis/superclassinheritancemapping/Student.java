package org.academiadecodigo.varichis.superclassinheritancemapping;

import javax.persistence.*;

@Entity(name = "student")
public class Student extends AbstractModel{

    private String name;
    private Integer grade;
    private String graduation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
}
