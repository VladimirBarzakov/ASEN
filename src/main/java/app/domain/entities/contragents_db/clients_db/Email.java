package app.domain.entities.contragents_db.clients_db;

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
