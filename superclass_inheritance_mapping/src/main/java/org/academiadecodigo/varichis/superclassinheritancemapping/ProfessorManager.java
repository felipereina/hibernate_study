package org.academiadecodigo.varichis.superclassinheritancemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class ProfessorManager {

    public void add(Professor professor, EntityManagerFactory factory){

        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(professor);
            manager.getTransaction().commit();
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }

    }

    public Professor update(Professor professor, EntityManagerFactory factory){

        EntityManager manager = factory.createEntityManager();
        try {
            manager.getTransaction().begin();
            Professor professorCopy = manager.merge(professor);
            manager.getTransaction().commit();
            return professorCopy;
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
            return null;
        } finally {
            manager.close();
        }

    }

    public Professor findById(int id, EntityManagerFactory factory){

        EntityManager manager = factory.createEntityManager();

        try{
            return manager.find(Professor.class, id);
        } finally {
            if(manager != null){
                manager.close();
            }
        }
    }
}
