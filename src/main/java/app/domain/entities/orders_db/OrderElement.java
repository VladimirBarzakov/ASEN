package app.domain.entities.orders_db;

import app.domain.entities.archive_db.orders_archive.TechOpRecord;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class OrderElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product frontSideProduct;

    @ManyToOne
    private Product backSideProduct;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal quantity;

    @ManyToOne
    private Order order;

    @OneToMany
    private Set<TechOpRecord> frontSideTechOpRecord;

    @OneToMany
    private Set<TechOpRecord> backSideTechOpRecord;
}
