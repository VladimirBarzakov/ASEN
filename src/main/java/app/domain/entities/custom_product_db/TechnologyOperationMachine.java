package app.domain.entities.custom_product_db;

import app.domain.entities.hr_db.Occupation;
import app.domain.entities.production_db.Machine;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
public class TechnologyOperationMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @ManyToOne
    private Machine machine;

    @ManyToMany
    private Set<TechnologyOperation> technologyOperation;

    @ManyToMany
    private List<Occupation> neededOperators;

    @Column(precision = 19, scale = 4)
    private BigDecimal hoursPerProduct;

    @Column(nullable = false,precision = 19, scale = 2)
    private BigDecimal cost;

    @Column(precision = 19, scale = 2)
    private BigDecimal addedValue;


}
