package org.academiadecodigo.variachis.joinedtableinheritancemapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fashion")
public class Fashion extends Graduation {

    private String workshop;

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }
}
