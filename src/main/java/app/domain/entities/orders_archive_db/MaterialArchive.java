package app.domain.entities.orders_archive_db;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MaterialArchive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private int materialId;

    @Column(nullable = false, length = 400, unique = true)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @OneToMany
    private Set<MaterialOperationArchive> participatedRecords;
}
