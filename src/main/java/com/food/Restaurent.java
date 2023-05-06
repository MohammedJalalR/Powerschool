package com.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Restaurent {
    @Value("Al-Daas Restaurent")
    private String RestuarentName;
   @Autowired
    private Waiter waiter;
   @Autowired
    private Biller biller;

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void setBiller(Biller biller) {
        this.biller = biller;
    }

    public void chicken()
    {
        System.out.println(RestuarentName);
        waiter.foodinfo();
        biller.Billingcharge();
        System.out.println("Tandoori Chicken!!!...");
    }
}
