package app.domain.entities.production_db;

import app.domain.entities.custom_product_db.Technology;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MachineType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private Set<Machine> machines;

    @ManyToMany
    private Set<Technology> technologiesParticipated;


}
