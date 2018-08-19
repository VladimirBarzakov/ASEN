package app.domain.entities.custom_product_db;

import app.domain.entities.production_db.Machine;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "technology")
public class Technology implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 400, unique = true)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private Set<TechnologyOperation> technologyOperations;

    @ManyToMany
    private Set<Machine> usedMachines;
}
