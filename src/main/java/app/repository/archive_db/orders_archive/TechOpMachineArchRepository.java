package app.repository.archive_db.orders_archive;

import app.domain.entities.archive_db.orders_archive.TechOpMachineArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechOpMachineArchRepository extends JpaRepository<TechOpMachineArch, Integer> {
}
