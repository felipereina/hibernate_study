package org.academiadecodigo.variachis.sigletableinheritancemapping;

import javax.persistence.*;

@Entity
@Table(name = "graduation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "graduation_field",
        discriminatorType = DiscriminatorType.STRING
)
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
