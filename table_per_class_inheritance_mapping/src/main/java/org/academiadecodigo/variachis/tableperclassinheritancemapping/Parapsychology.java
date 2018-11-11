package org.academiadecodigo.variachis.tableperclassinheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="parapsychology")
public class Parapsychology extends Graduation{

    private Integer laboratory;

    public Integer getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Integer laboratory) {
        this.laboratory = laboratory;
    }

    @Override
    public String toString() {
        return "Parapsychology{" +
                "laboratory=" + laboratory +
                '}';
    }
}
