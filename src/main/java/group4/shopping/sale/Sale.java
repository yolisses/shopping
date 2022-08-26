package group4.shopping.sale;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Data
@Entity
public class Sale {
    @Id
    @GeneratedValue
    private long id;
    
    private double price;

    @CreationTimestamp
    private Instant createdAt;
}
