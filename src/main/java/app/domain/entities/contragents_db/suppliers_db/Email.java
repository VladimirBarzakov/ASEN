package app.domain.entities.contragents_db.suppliers_db;

import app.domain.entities.contragents_db.clients_db.Client;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Email {

    @Id
    private String email;

    @ManyToMany
    private Set<Client> clients;
}
