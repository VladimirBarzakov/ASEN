package app.domain.entities.custom_product_db;

import app.domain.entities.archive_db.material_archive.MaterialArch;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;


@Entity
@Table(name = "materials_operation")
public class TechnologyOperationMaterial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @ManyToOne
    private Material material;

    @ManyToMany
    private Set<TechnologyOperation> technologyOperation;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal materialConsumptionRate;

    @Nullable
    @Column(precision = 19, scale = 2)
    private BigDecimal addedValue;

    @OneToOne
    private MaterialArch materialArch;

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
