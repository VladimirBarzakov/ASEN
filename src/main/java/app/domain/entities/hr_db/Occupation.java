package app.domain.entities.hr_db;

import app.domain.entities.archive_db.hr_archive.OccupationArch;
import app.domain.entities.custom_product_db.TechnologyOperationLabour;
import app.domain.entities.custom_product_db.TechnologyOperationMachine;
import app.domain.entities.production_db.Machine;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Occupation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 400)
    private String occupationName;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String occupationDescription;

    @ManyToMany
    private Set<Employee> employees;

    @ManyToMany
    private Set<Machine> machineSet;

    @OneToMany
    private Set<TechnologyOperationLabour> techOperations;

    @ManyToMany
    private Set<TechnologyOperationMachine> machineTechOperations;

    @OneToOne
    private OccupationArch occupationArch;
}
