package app.repository.archive_db.machine_archive;

import app.domain.entities.archive_db.machine_archive.MachineArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineArchRepository extends JpaRepository<MachineArch, Integer> {
}
