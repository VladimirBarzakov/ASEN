package app.domain.entities.orders_db;

import app.domain.entities.contragents_db.clients_db.Client;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date date;

    @OneToMany
    private Set<OrderElement> orderElementSet;

    @ManyToOne
    private Client client;

}
