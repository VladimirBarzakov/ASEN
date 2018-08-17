package app.domain.entities.orders_db;

import app.domain.entities.custom_product_db.base_ents.Material;
import app.domain.entities.custom_product_db.secondary_ents.TechnologyOperations;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private Set<ProductType> productTypeSet;

    @ManyToMany
    private Set<Material> entryMaterials;

    @ManyToMany
    private Set<TechnologyOperations> exitPointsOperations;

    @ManyToMany
    private Set<Material> exitPointMaterials;

    @OneToMany
    private Set<OrderElement> orderElementSet;
}
