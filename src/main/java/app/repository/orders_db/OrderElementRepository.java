package app.repository.orders_db;

import app.domain.entities.orders_db.OrderElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderElementRepository extends JpaRepository<OrderElement, Integer> {
}
