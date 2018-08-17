package app.domain.entities.orders_archive_db;

import app.domain.entities.orders_db.OrderElement;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class OrderElementRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private OrderElement orderElement;

    @ManyToOne
    private TechOperationsArch techOperationsArch;

    @Column(precision = 19, scale = 2)
    private BigDecimal costOfOperation;

    @Column(precision = 19, scale = 2)
    private BigDecimal addedValueOfOperation;

    @Column(precision = 19, scale = 2)
    private BigDecimal totalCost;

    @Column(precision = 19, scale = 2)
    private BigDecimal totalPrice;

    @OneToMany
    private Set<MaterialOperationArchive> materialArchives;
}
