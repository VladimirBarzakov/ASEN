package app.repository.archive_db.orders_archive;

import app.domain.entities.archive_db.orders_archive.TechOpMaterialArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechOpMaterialArchRepository extends JpaRepository<TechOpMaterialArch, Integer> {
}
