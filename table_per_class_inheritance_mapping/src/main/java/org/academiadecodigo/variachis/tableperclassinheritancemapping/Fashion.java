package org.academiadecodigo.variachis.tableperclassinheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="fashion")
public class Fashion extends Graduation {

    private String workshop;

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }
}
