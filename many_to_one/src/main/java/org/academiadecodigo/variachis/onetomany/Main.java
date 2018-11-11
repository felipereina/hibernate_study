package org.academiadecodigo.variachis.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
        EntityManager manager = factory.createEntityManager();

        Master master1 = new Master();
        master1.setName("Ash");
        master1.setPokemons(new HashSet<>());

        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName("Pikachu");
        Pokemon pokemon2 = new Pokemon();
        pokemon2.setName("Bulbasaur");

        master1.capturePokemon(pokemon1);
        master1.capturePokemon(pokemon2);

        try {
            manager.getTransaction().begin();
            manager.persist(master1);
            manager.getTransaction().commit();
        } catch(RollbackException ex){
            manager.getTransaction().rollback();
        } finally {
            manager.close();
        }

    }
}
