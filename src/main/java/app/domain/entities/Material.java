package app.domain.entities;


import app.enums.MaterialRoleInProduction;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "materials")
public class Material implements Serializable {

    @Id
    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @NonNull
    private MaterialRoleInProduction roleInTechnologyCycle;

    @Column(precision = 19, scale = 2)
    private BigDecimal cost;

    @Column(precision = 19, scale = 2)
    private BigDecimal price;

    @OneToMany()
    private Set<MatTechCombination> technologyToBeProcessedWith;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "output_materials",
    joinColumns = {@JoinColumn(name="material_id")},
    inverseJoinColumns = {@JoinColumn(name="technology_id")})
    private Set<Technology> outputTechnology = new TreeSet<>();
}
