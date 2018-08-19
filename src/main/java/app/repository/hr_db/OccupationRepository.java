package app.repository.hr_db;

import app.domain.entities.hr_db.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Integer> {
}
