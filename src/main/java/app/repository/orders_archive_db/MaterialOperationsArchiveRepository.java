package app.repository.orders_archive_db;


import app.domain.entities.orders_archive_db.MaterialOperationArchive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialOperationsArchiveRepository extends JpaRepository<MaterialOperationArchive, Integer> {
}
