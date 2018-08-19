package app.domain.entities.archive_db.hr_archive;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class EmployeeArch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private int employeeId;

    @Column(nullable = false, length = 255)
    private String firstName;

    @Column(nullable = false, length = 255)
    private String sirName;

    @Column(nullable = false, length = 255)
    private String familyName;
}
