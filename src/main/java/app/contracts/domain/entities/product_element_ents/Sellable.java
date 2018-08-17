package app.contracts.domain.entities.product_element_ents;

import java.math.BigDecimal;

public interface Sellable {
    
    BigDecimal getPrice();

    BigDecimal getCost();
}
