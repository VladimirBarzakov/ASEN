package app.repository.custom_product_db;

import app.domain.entities.custom_product_db.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyOperationsRepository extends JpaRepository<Technology, Integer> {
}
