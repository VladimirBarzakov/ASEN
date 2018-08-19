package app.domain.entities.archive_db.orders_archive;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class TechOpArch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private int techOpId;

    @Column(nullable = false, length = 1000, unique = true)
    private String name;
}
