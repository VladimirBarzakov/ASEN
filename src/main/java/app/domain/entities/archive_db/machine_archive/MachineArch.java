package app.domain.entities.archive_db.machine_archive;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class MachineArch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private int machineId;

    private String serialNumber;

    @Column(nullable = false, length = 400, unique = true)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;
}
