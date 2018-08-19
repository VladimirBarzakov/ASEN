package app.domain.entities.warehouse_db.input_materials;

import javax.persistence.*;
import java.util.Set;

public class MaterialType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 400)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private Set<Material> materials;
}
