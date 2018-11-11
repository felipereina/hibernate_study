package org.academiadecodigo.variachis.manytomany;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="student")
public class Student {
    @Id
    private Integer student_id;
    private String name;

    @ManyToMany(
            mappedBy = "student",
            fetch = FetchType.EAGER
    )
    private Set<Professor> professors;

    public void addProfessor(Professor professor){
        professors.add(professor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(Set<Professor> professors) {
        this.professors = professors;
    }
}
