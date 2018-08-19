package app.repository.orders_archive_db;

import app.domain.entities.archive_db.material_archive.MaterialArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialArchiveRepository extends JpaRepository<MaterialArch, Integer> {
}
