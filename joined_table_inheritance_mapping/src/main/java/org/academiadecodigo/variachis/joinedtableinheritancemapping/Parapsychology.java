package org.academiadecodigo.variachis.joinedtableinheritancemapping;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="parapsychology")
public class Parapsychology extends Graduation{

    private Integer laboratory;

    public Integer getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Integer laboratory) {
        this.laboratory = laboratory;
    }
}
