package app.domain.entities.contragents_db.clients_db;

import app.domain.entities.orders_db.Order;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    private Set<Phone> phones;

    @ManyToMany
    private Set<Address> postAddresses;

    @ManyToMany
    private Set<Address> deliveryAddresses;

    @OneToMany
    private Set<Order> orderHistory;


}
