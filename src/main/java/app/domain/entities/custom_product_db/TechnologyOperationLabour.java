package app.domain.entities.custom_product_db;

import app.domain.entities.hr_db.Occupation;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class TechnologyOperationLabour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Occupation occupation;

    @ManyToMany
    private Set<TechnologyOperation> technologyOperation;

    @Column(precision = 19, scale = 4)
    private BigDecimal labourHoursPerOperation;

    @Column(nullable = false,precision = 19, scale = 2)
    private BigDecimal cost;

    @Column(nullable = false,precision = 19, scale = 2)
    private BigDecimal price;
}
