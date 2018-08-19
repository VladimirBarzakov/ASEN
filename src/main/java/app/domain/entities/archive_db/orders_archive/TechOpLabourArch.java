package app.domain.entities.archive_db.orders_archive;

import app.domain.entities.archive_db.hr_archive.EmployeeArch;
import app.domain.entities.archive_db.hr_archive.OccupationArch;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class TechOpLabourArch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private EmployeeArch employeeArchId;

    @ManyToOne
    private OccupationArch occupationArch;

    @NonNull
    @Column(precision = 19, scale = 2)
    private BigDecimal hoursWorked;

    @NonNull
    @Column(precision = 19, scale = 2)
    private BigDecimal cost;

    @NonNull
    @Column(precision = 19, scale = 2)
    private BigDecimal addedValue;
}
