package app.domain.entities.archive_db.material_archive;

import app.domain.entities.archive_db.orders_archive.TechOpMaterialArch;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MaterialArch {

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
    private Set<TechOpMaterialArch> participatedRecords;
}
