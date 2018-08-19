package app.repository.clients_db.clients_db;

import app.domain.entities.contragents_db.clients_db.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientAddressRepository extends JpaRepository<Address, Integer> {
}
