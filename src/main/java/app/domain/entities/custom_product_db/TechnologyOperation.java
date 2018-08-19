package app.domain.entities.custom_product_db;

import app.contracts.domain.entities.product_element_ents.Sellable;
import app.domain.entities.archive_db.orders_archive.TechOpArch;
import app.domain.entities.orders_db.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tech_operations")
public class TechnologyOperation implements Serializable, Sellable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 1000, unique = true)
    private String name;

    @ManyToMany
    private Set<Technology> technologies;

    @OneToMany
    private Set<TechnologyOperationMaterial> materialsForOperation;

    @OneToMany
    private List<TechnologyOperationLabour> manPower;

    @ManyToMany
    private List<TechnologyOperationMachine> neededMachines;

    @Column(precision = 19, scale = 2)
    private BigDecimal costOfOperation;


    @Column(precision = 19, scale = 2)
    private BigDecimal addedValueOfOperation;

    @ManyToMany
    private Set<TechnologyOperation> previousOperations;

    @ManyToMany
    private Set<TechnologyOperation> nextOperations;

    @ManyToMany
    private Set<Product> productExitPoint;

    @OneToOne
    private TechOpArch techOpArch;

    @Override
    public BigDecimal getCost(){
        BigDecimal totalCost = this.costOfOperation;
        for (TechnologyOperationMaterial combination : materialsForOperation) {
            totalCost=totalCost.add(combination.getCost());
        }
        //TODO manpower
        return totalCost;
    }

    @Override
    public BigDecimal getPrice(){
        BigDecimal totalAddedValue = this.addedValueOfOperation;
        for (TechnologyOperationMaterial combination : materialsForOperation) {
            totalAddedValue=totalAddedValue.add(combination.getPrice());
        }
        //TODO manpower
        return totalAddedValue;
    }
}
