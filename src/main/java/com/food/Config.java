package com.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.food")
public class Config {
 /*   @Bean
    public Restaurent restaurent()
    {
      Restaurent restaurent= new Restaurent();
        restaurent.setWaiter(waiter());
        restaurent.setBiller(biller());
        return restaurent;

    }
    @Bean
    public  Waiter waiter()
    {
        return new Waiter();
    }
    @Bean
    public Biller biller()
    {
        return new Biller();
    }*/
}
