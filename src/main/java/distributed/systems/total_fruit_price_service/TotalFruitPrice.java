package distributed.systems.total_fruit_price_service;

import java.math.BigDecimal;

public class TotalFruitPrice {
    private Long id;
    private String fruit;
    private String month;
    private BigDecimal quantity;
    private BigDecimal fmp;
    private BigDecimal totalFruitPrice;
    private String environment;

    public TotalFruitPrice() {}
    public TotalFruitPrice(Long id, String fruit, String month, BigDecimal quantity,
     BigDecimal fmp, BigDecimal totalFruitPrice, String environment){
        super();
        this.id = id;
        this.fruit = fruit;
        this.month = month;
        this.quantity = quantity;
        this.fmp = fmp;
        this.totalFruitPrice = totalFruitPrice;
        this.environment = environment;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFruit(){
        return fruit;
    }

    public void setFruit(String fruit){
        this.fruit = fruit;
    }

    public String getMonth(){
        return month;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public BigDecimal getQuantity(){
        return quantity;
    }

    public void setQuantity(BigDecimal quantity){
        this.quantity = quantity;
    }

    public BigDecimal getFMP(){
        return fmp;
    }

    public void setFMP(BigDecimal fmp){
        this.fmp = fmp;
    }

    public BigDecimal getTotalFruitPrice(){
        return totalFruitPrice;
    }

    public void setTotalFruitPrice(BigDecimal totalFruitPrice){
        this.totalFruitPrice = totalFruitPrice;
    }

    public String getEnvironment(){
        return environment;
    }

    public void setEnvironment(String environment){
        this.environment = environment;
    }
}
