package group4.shopping.sale;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sales")
public class SaleController {
    SaleRepo saleRepo;
    
    @RequestMapping("/add")
    public Sale add() {
        var sale = new Sale();
        return saleRepo.save(sale);
    }

    @RequestMapping("/")
    public List<Sale> all() {
        return saleRepo.findAll();
    }
}
