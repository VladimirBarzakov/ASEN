package app.domain.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "technology")
public class Technology {

    @Id
    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String description;

    @OneToMany()
    private Set<MatTechCombination> materialsToProcess;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "outputTechnology")
    private Set<Material> processedMaterials;

}
