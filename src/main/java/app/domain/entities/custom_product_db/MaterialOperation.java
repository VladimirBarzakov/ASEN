package app.domain.entities.custom_product_db;

import app.domain.entities.orders_archive_db.MaterialArchive;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Entity
@Table(name = "materials_operation")
public class MaterialOperation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @OneToOne
    private Material material;

    @NonNull
    @OneToOne
    private TechnologyOperations technologyOperations;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal materialConsumptionRate;

    @Nullable
    @Column(precision = 19, scale = 2)
    private BigDecimal addedValue;

    @OneToOne
    private MaterialArchive materialArchive;

    public BigDecimal getMaterialConsumptionRate() {
        return this.materialConsumptionRate;
    }

    public BigDecimal getCost(){
        return this.material.getCost().multiply(this.materialConsumptionRate);
    }

    public BigDecimal getPrice() {
        if (this.addedValue==null){
            return this.material.getPrice().multiply(this.materialConsumptionRate);
        }
        return this.addedValue;
    }
}
