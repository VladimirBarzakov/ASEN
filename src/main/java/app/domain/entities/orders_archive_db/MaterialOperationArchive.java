package app.domain.entities.orders_archive_db;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class MaterialOperationArchive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private MaterialArchive materialArchive;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal quantity;

    @NonNull
    @Column(precision = 19, scale = 2)
    private BigDecimal cost;

    @NonNull
    @Column(precision = 19, scale = 2)
    private BigDecimal price;

    public BigDecimal getCost() {
        return this.cost;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}
