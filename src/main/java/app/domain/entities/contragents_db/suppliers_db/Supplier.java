package app.domain.entities.contragents_db.suppliers_db;

import app.domain.entities.warehouse_db.input_materials.Material;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Supplier {
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
    private Set<Material> delliveryHistory;
}
