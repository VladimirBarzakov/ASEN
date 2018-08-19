package app.domain.entities.hr_db;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String firstName;

    @Column(nullable = false, length = 255)
    private String sirName;

    @Column(nullable = false, length = 255)
    private String familyName;

    @ManyToMany
    private Set<Occupation> occupationSet;

    @OneToMany
    private Set<Phone> phoneSet;

    @Column(precision = 19, scale = 2)
    private BigDecimal salary;

    @NonNull
    private int dayOffPerYear;

    @NonNull
    private int totalDayOff;
}
