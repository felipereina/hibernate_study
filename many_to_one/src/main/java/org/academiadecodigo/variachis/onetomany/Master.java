package org.academiadecodigo.variachis.onetomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "master")
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "master"
    )
    private Set<Pokemon> pokemons;

    public void capturePokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        pokemon.setMaster(this);
    }

    public void releasePokemon(Pokemon pokemon){
        pokemons.remove(pokemon);
        pokemon.setMaster(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Set<Pokemon> getPokemons() {
        return pokemons;
    }
}
