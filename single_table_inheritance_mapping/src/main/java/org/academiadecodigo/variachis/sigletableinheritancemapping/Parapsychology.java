package org.academiadecodigo.variachis.sigletableinheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "parapsychology")
@DiscriminatorValue("parapsychology")
public class Parapsychology extends Graduation{

    private Integer laboratory;

    public Integer getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Integer laboratory) {
        this.laboratory = laboratory;
    }
}
