package app.domain.entities.clients_db;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String country;

    @Column(nullable = false, length = 255)
    private String town;

    @Column(nullable = false, length = 255)
    private String adress;

    @ManyToMany
    private Set<Client> clients;
}
