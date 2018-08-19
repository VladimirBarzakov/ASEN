package app.repository.warehouse_db.input_materials;

import app.domain.entities.warehouse_db.input_materials.MaterialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialTypeRepository extends JpaRepository<MaterialType, Integer> {
}
