package org.academiadecodigo.variachis.onetomany;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    private Master master;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pokemon){
            Pokemon po = (Pokemon) obj;
            if(this.name.equals(po.getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
