package app.repository.archive_db.hr_archive;

import app.domain.entities.archive_db.hr_archive.EmployeeArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeArchRepository extends JpaRepository<EmployeeArch, Integer> {
}
