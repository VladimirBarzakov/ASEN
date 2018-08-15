package app.domain.entities;

import org.springframework.lang.NonNull;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class MatTechIdentity implements Serializable {

    @NonNull
    @OneToOne
    private Material material;

    @NonNull
    @OneToOne
    private Technology Technology;

    public MatTechIdentity() {
    }

    public MatTechIdentity(Material material, app.domain.entities.Technology technology) {
        this.material = material;
        Technology = technology;
    }

    public Material getMaterial() {
        return this.material;
    }

    public app.domain.entities.Technology getTechnology() {
        return this.Technology;
    }
}
