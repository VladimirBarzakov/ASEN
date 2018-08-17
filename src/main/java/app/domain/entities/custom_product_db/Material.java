package app.domain.entities.custom_product_db;


import app.contracts.domain.entities.product_element_ents.Sellable;
import app.domain.entities.orders_db.Product;
import app.enums.MaterialRoleInProduction;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "materials")
public class Material implements Serializable, Sellable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 400, unique = true)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    //TODO
    @NonNull
    private MaterialRoleInProduction roleInTechnologyCycle;

    @Column(precision = 19, scale = 2)
    private BigDecimal cost;

    @Column(precision = 19, scale = 2)
    private BigDecimal price;

    @OneToMany
    private Set<MaterialOperation> materialOperations;

    @ManyToMany
    private Set<Product> productEntryPoint;

    @ManyToMany
    private Set<Product> productExitPoint;

    @Override
    public BigDecimal getCost() {
        return this.cost;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
