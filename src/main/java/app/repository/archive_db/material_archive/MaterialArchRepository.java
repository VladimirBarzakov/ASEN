package app.repository.archive_db.material_archive;

import app.domain.entities.archive_db.material_archive.MaterialArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialArchRepository extends JpaRepository<MaterialArch, Integer> {
}
