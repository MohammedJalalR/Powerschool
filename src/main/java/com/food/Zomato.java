package com.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Zomato {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config.class);
        Restaurent restaurent=(Restaurent) applicationContext.getBean("restaurent");
        restaurent.chicken();




    }
}