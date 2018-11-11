package org.academiadecodigo.variachis.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        EntityManager manager = factory.createEntityManager();

        Child child1 = new Child();
        child1.setName("João");
        child1.setAge(8);

        Tamagotchi tamagotchi1 = new Tamagotchi();
        tamagotchi1.setName("Lulu");
        tamagotchi1.setBrand("Bandai");
        tamagotchi1.setChild(child1);
        child1.setTamagotchi(tamagotchi1);

        Child child2 = new Child();
        child2.setName("Cristiano");
        child2.setAge(7);

        Tamagotchi tamagotchi2 = new Tamagotchi();
        tamagotchi2.setName("Bradock");
        tamagotchi2.setBrand("Lusa");
        tamagotchi2.setChild(child2);
        child2.setTamagotchi(tamagotchi2);

        try {
            manager.getTransaction().begin();
            manager.persist(child1);
            manager.persist(child2);
            manager.getTransaction().commit();
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }
    }
}
