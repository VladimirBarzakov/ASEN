package app.repository.orders_archive_db;


import app.domain.entities.archive_db.orders_archive.TechOpMaterialArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialOperationsArchiveRepository extends JpaRepository<TechOpMaterialArch, Integer> {
}
