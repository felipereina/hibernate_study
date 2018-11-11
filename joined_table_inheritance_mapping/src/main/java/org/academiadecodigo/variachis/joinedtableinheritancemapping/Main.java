package org.academiadecodigo.variachis.joinedtableinheritancemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        EntityManager manager = factory.createEntityManager();

        Parapsychology graduation1 = new Parapsychology();
        Fashion graduation2 = new Fashion();
        graduation1.setCampus("Fundão");
        graduation1.setLaboratory(3);
        graduation2.setCampus("Covilhã");
        graduation2.setWorkshop("skirt design");

        try {
            manager.getTransaction().begin();
            manager.persist(graduation1);
            manager.persist(graduation2);
            manager.getTransaction().commit();
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }
}
