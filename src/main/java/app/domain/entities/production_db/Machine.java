package app.domain.entities.production_db;

import app.domain.entities.archive_db.machine_archive.MachineArch;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 400)
    private String name;

    @Column(unique = true)
    private String serialNumber;

    @ManyToMany
    private Set<MachineType> machineType;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @OneToOne
    private MachineArch machineArch;
}
