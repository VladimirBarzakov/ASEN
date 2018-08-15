package app.domain.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Entity
@Table(name = "materials_technology")
public class MatTechCombination implements Serializable {

    @EmbeddedId
    private MatTechIdentity matTechIdentity;

    @Column(precision = 19, scale = 2)
    private BigDecimal costOfTechnology;

    private Double materialConsumptionRate;

    @Column(precision = 19, scale = 2)
    private BigDecimal addedValue;

    public Material getMaterial(){
        return this.matTechIdentity.getMaterial();
    }

    public Technology getTechnology(){
        return this.matTechIdentity.getTechnology();
    }
}
