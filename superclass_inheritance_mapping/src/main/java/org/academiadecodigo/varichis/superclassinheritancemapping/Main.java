package org.academiadecodigo.varichis.superclassinheritancemapping;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        StudentManager studentManager = new StudentManager();
        ProfessorManager professorManager = new ProfessorManager();

        Student student1 = new Student();
        student1.setName("Miguel");
        student1.setGrade(7);
        student1.setGraduation("Parapsychology");

        Student student2 = new Student();
        student2.setName("Rodrigo");
        student2.setGrade(4);
        student2.setGraduation("Fashion");

        Professor professor1 = new Professor();
        professor1.setName("Sara");
        professor1.setGraduation("Parapsychology");

        studentManager.add(student1,factory);
        studentManager.add(student2,factory);
        professorManager.add(professor1,factory);

        student1.setGrade(3);

        studentManager.update(student1,factory);

    }
}
