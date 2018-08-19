package app.domain.entities.hr_db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
public class Phone {

    @Id
    private String number;

    @ManyToOne
    private Set<Employee> clientSet;
}
