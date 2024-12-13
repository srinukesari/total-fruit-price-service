package distributed.systems.total_fruit_price_service;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TotalFruitPriceController {

    @Autowired
    private FruitMonthPriceProxy fruitMonthPriceProxy;
        

    @GetMapping("/total-fruit-price/fruit/{fruit}/month/{month}/quantity/{quantity}")
    public TotalFruitPrice calculateTotalFruitPrice(
        @PathVariable String fruit,
        @PathVariable String month,
        @PathVariable BigDecimal quantity
    ){
        HashMap<String,String> pathVariables = new HashMap<>();
        pathVariables.put("fruit", fruit);
        pathVariables.put("month", month);

        // ResponseEntity<TotalFruitPrice> responseEntity = new RestTemplate().
        //     // getForEntity("http://localhost:8000/fruit-month-price/fruit/{fruit}/month/{month}", 
        //     // TotalFruitPrice.class, pathVariables);

        ResponseEntity<TotalFruitPrice> responseEntity = fruitMonthPriceProxy.calculateTotalFruitPrice(fruit, month);
        

        System.out.println("check for ++++++++++++++++" + responseEntity);
        TotalFruitPrice totalFruitPrice = responseEntity.getBody();


        return new TotalFruitPrice(totalFruitPrice.getId(), fruit, month, quantity,
            totalFruitPrice.getFMP(), quantity.multiply(totalFruitPrice.getFMP()), 
            totalFruitPrice.getEnvironment() + " : total fruit price rest call env");
    }

}
