package org.academiadecodigo.variachis.manytomany;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="professor")
public class Professor {
    @Id
    private Integer professor_id;
    private String name;

    @ManyToMany(
         fetch = FetchType.LAZY
    )
    private Set<Student> students;


    public void addStudent(Student student){
        students.add(student);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
