package com.techblazer.springbatchdemo.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class CoffeeItemProcessor implements ItemProcessor<Coffee, Coffee> {

    @Override
    public Coffee process(final Coffee coffee) {
        String brand = coffee.getBrand().toUpperCase();
        String origin = coffee.getOrigin().toUpperCase();
        Long id = coffee.getId();

        Coffee transformedCoffee = new Coffee(id, brand, origin);
        log.info("Converting ( {} ) into ( {} )", coffee, transformedCoffee);

        return transformedCoffee;
    }

}
