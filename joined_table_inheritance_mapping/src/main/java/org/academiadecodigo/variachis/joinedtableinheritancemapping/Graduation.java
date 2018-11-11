package org.academiadecodigo.variachis.joinedtableinheritancemapping;

import javax.persistence.*;

@Entity
@Table(name="graduation")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Graduation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String campus;

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
