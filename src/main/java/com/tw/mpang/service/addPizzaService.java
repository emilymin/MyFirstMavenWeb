package com.tw.mpang.service;

import com.tw.mpang.model.Customer;
import com.tw.mpang.model.Order;
import com.tw.mpang.model.Pizza;

import java.text.DecimalFormat;

public interface AddPizzaService {
    public Pizza createPizza();
    public void addPizzaSpecies(String species);
    public String getPizzaFlavour(String flavour);
    public String getPizzaSize(String size);
    public void savePizza(Pizza pizza);
    public Customer getCustomerInfo();
    public DecimalFormat calculatePizzaCost(Pizza pizza);
    public Order generateOrder(Pizza pizza, Customer customer);
}
