package app.domain.entities.production_db;

import app.domain.entities.custom_product_db.Technology;
import app.domain.entities.custom_product_db.TechnologyOperation;

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


    private Set<Technology> technologiesParticipated;

    private Set<TechnologyOperation> technologyOperation;


}
