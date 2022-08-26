package group4.shopping.sale;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@AllArgsConstructor
@RequestMapping("/sales")
public class SaleController {
    SaleRepo saleRepo;
    final Random random = new Random();

    @RequestMapping("/add")
    public Sale add() {
        var sale = new Sale();
        var price = random.nextInt(10000) / 100.0;
        sale.setPrice(price);
        return saleRepo.save(sale);
    }

    @RequestMapping("/")
    public List<Sale> all() {
        return saleRepo.findAll();
    }
}
