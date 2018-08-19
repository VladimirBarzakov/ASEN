package app.repository.archive_db.orders_archive;

import app.domain.entities.archive_db.orders_archive.TechOpArch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechOpRecordRepository extends JpaRepository<TechOpArch, Integer> {
}
