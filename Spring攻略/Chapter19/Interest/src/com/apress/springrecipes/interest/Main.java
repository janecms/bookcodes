package com.apress.springrecipes.interest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("beans.xml");

        InterestCalculator calculator =
            (InterestCalculator) context.getBean("interestCalculator");
        System.out.println(calculator.calculate(100000, 1));
    }
}
