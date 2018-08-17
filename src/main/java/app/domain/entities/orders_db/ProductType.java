package app.domain.entities.orders_db;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String productType;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @ManyToMany
    private Set<Product> products;
}
