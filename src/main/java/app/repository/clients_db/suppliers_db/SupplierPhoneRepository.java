package app.repository.clients_db.suppliers_db;

import app.domain.entities.contragents_db.suppliers_db.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierPhoneRepository extends JpaRepository<Phone, Integer> {
}
