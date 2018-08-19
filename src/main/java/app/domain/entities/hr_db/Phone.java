package app.domain.entities.hr_db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

    @Id
    private String number;

    @ManyToOne
    private Employee employee;
}
