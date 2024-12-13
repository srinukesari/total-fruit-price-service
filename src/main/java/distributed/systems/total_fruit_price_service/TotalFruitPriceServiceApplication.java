package distributed.systems.total_fruit_price_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TotalFruitPriceServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TotalFruitPriceServiceApplication.class, args);
	}
}
