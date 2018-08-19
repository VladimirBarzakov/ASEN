package app.domain.entities.archive_db.orders_archive;

import app.domain.entities.archive_db.machine_archive.MachineArch;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class TechOpMachineArch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private MachineArch machineArch;

    @Column(precision = 19, scale = 4)
    private BigDecimal hoursPerProduct;

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
