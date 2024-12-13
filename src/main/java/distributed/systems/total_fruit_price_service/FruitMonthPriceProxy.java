package distributed.systems.total_fruit_price_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="fruit-month-price")
public interface FruitMonthPriceProxy {

    @GetMapping("/fruit-month-price/fruit/{fruit}/month/{month}")
    public ResponseEntity<TotalFruitPrice> calculateTotalFruitPrice(
        @PathVariable String fruit,
        @PathVariable String month
    );
}
