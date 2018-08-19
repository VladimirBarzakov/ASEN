package app.domain.entities.archive_db.hr_archive;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class OccupationArch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Nullable
    private int occupationId;

    @Column(nullable = false, length = 400)
    private String occupationName;

    @Column(nullable = true,columnDefinition = "TEXT")
    private String occupationDescription;
}
