package org.academiadecodigo.variachis.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        EntityManager manager = factory.createEntityManager();

        Student student1 = new Student();
        Student student2 = new Student();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        student1.addProfessor(professor2);
        student2.addProfessor(professor1);
        professor2.addStudent(student1);
        professor1.addStudent(student2);

        try {
            manager.getTransaction().begin();
            manager.persist(student1);
            manager.persist(student2);
            manager.persist(professor1);
            manager.persist(professor2);
            manager.getTransaction().commit();
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }

    }
}
