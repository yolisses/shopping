package group4.shopping.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepo extends JpaRepository<Sale, Long> {
}
