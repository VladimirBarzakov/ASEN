package app.domain.entities.warehouse_db.input_materials;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    private Set<MaterialType> typeSet;

    @Column(nullable = false,length = 400)
    private String name;


    private Date deliveryDate;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal quantityDelivered;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal quantityLeft;

    @Column(precision = 19, scale = 2)
    private BigDecimal deliveredPrice;
}
