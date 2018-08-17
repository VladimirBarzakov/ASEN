package app.domain.entities.orders_db;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class OrderElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    @NonNull
    @Column(precision = 19, scale = 4)
    private BigDecimal quantity;

    @ManyToOne
    private Order order;
}
