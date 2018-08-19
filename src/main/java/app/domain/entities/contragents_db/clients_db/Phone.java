package app.domain.entities.contragents_db.clients_db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Phone {

    @Id
    private String number;

    @ManyToMany
    private Set<Client> clientSet;
}
