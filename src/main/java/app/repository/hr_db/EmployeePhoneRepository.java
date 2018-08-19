package app.repository.hr_db;

import app.domain.entities.hr_db.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePhoneRepository extends JpaRepository<Phone, String> {
}
