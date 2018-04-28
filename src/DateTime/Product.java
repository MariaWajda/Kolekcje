package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Product {
    private String name;
    private String description;
    private String specification;
    private LocalDate validUntil;

    public Product(String name, String description, String specification, LocalDate validUntil) {
        this.name = name;
        this.description = description;
        this.specification = specification;
        this.validUntil = validUntil;
    }

    public Product() {

    }

    public boolean isValid (Product product){
        if (LocalDate.now().until(validUntil, ChronoUnit.MINUTES)>0){
            return true;
        } return false;
    }
}
