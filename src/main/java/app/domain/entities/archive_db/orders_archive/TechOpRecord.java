package app.domain.entities.archive_db.orders_archive;

import app.domain.entities.orders_db.OrderElement;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class TechOpRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private OrderElement orderElement;

    @ManyToOne
    private TechOpArch techOpArch;

    @OneToMany
    private Set<TechOpMaterialArch> materialArchSet;

    @OneToMany
    private Set<TechOpLabourArch> labourArchSet;

    @OneToMany
    private Set<TechOpMachineArch> machineArchSet;

    @Column(precision = 19, scale = 2)
    private BigDecimal totalCost;

    @Column(precision = 19, scale = 2)
    private BigDecimal totalPrice;


}
