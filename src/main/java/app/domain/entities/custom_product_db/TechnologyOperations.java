package app.domain.entities.custom_product_db;

import app.contracts.domain.entities.product_element_ents.Sellable;
import app.domain.entities.orders_archive_db.TechOperationsArch;
import app.domain.entities.orders_db.Product;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tech_operations")
public class TechnologyOperations implements Serializable, Sellable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @OneToOne
    private Technology technology;

    @OneToMany
    private List<MaterialOperation> materialsForOperation;

    @Column(precision = 19, scale = 2)
    private BigDecimal costOfOperation;


    @Column(precision = 19, scale = 2)
    private BigDecimal addedValueOfOperation;

    @ManyToMany
    private Set<TechnologyOperations> previousOperations;

    @ManyToMany
    private Set<TechnologyOperations> nextOperations;

    @ManyToMany
    private Set<Product> productExitPoint;

    @OneToOne
    private TechOperationsArch archiveId;

    @Override
    public BigDecimal getCost(){
        BigDecimal totalCost = this.costOfOperation;
        for (MaterialOperation combination : materialsForOperation) {
            totalCost=totalCost.add(combination.getCost());
        }
        return totalCost;
    }

    @Override
    public BigDecimal getPrice(){
        BigDecimal totalAddedValue = this.addedValueOfOperation;
        for (MaterialOperation combination : materialsForOperation) {
            totalAddedValue=totalAddedValue.add(combination.getPrice());
        }
        return totalAddedValue;
    }
}
