package app.domain.entities.orders_archive_db;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TechOperationsArch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private int techOperationsId;

    @Column(nullable = false, length = 400, unique = true)
    private String name;

    @OneToMany
    private Set<OrderElementRecord> participatedRecords;
}
