package app.domain.entities.archive_db.orders_archive;

import app.domain.entities.archive_db.material_archive.MaterialArch;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class TechOpMaterialArch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private MaterialArch materialArch;

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
