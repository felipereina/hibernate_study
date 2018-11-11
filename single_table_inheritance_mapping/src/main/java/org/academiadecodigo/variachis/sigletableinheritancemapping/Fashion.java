package org.academiadecodigo.variachis.sigletableinheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fashion")
@DiscriminatorValue("fashion")
public class Fashion extends Graduation {

    private String workshop;

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }
}
