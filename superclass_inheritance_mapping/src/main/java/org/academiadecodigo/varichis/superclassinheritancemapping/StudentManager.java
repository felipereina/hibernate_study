package org.academiadecodigo.varichis.superclassinheritancemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class StudentManager {

    public void add(Student student, EntityManagerFactory factory){

        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(student);
            manager.getTransaction().commit();
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }

    }

    public Student update(Student student, EntityManagerFactory factory){

        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            Student studentCopy = manager.merge(student);
            manager.getTransaction().commit();
            return studentCopy;
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
            System.out.println("Deu Merda!");
            return null;
        } finally {
            manager.close();
        }

    }

    public Student findById(int id, EntityManagerFactory factory){

        EntityManager manager = factory.createEntityManager();

        try{
            return manager.find(Student.class, id);
        } finally {
            if(manager != null){
                manager.close();
            }
        }
    }
}
