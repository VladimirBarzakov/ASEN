package app.repository.orders_archive_db;

import app.domain.entities.orders_archive_db.OrderElementRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderElementRecordRepository extends JpaRepository<OrderElementRecord, Integer> {
}
