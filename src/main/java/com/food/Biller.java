package com.food;

import org.springframework.stereotype.Component;

@Component
public class Biller {

    public void Billingcharge()
    {
        System.out.println("Total Cost is 240 rupees!!!...");
        System.out.println("Added extra cost");
    }
}
