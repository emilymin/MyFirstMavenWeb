package com.tw.mpang.service;

import com.tw.mpang.model.Customer;
import com.tw.mpang.model.Order;
import com.tw.mpang.model.Pizza;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service("addPizzaService")
public class AddPizzaServiceImpl implements AddPizzaService {
    private Pizza pizza;

    public Pizza createPizza() {
        pizza  = new Pizza();
        return pizza;
    }

    public void addPizzaSpecies(String species) {
        pizza.setSpecies(species);
    }

    public String getPizzaFlavour(String flavour) {
        return flavour;
    }

    public String getPizzaSize(String size) {
        return null;
    }

    public void savePizza(Pizza pizza) {
    }

    public Customer getCustomerInfo() {
        return null;
    }

    public DecimalFormat calculatePizzaCost(Pizza pizza) {
        return null;
    }

    public Order generateOrder(Pizza pizza, Customer customer) {
        return null;
    }
}
