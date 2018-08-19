package app.repository.production_db;

import app.domain.entities.production_db.MachineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineTypeRepository extends JpaRepository<MachineType, Integer> {
}
