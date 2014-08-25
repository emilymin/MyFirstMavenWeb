package com.tw.mpang.model;

import com.tw.mpang.constant.PizzaDetail;

import java.text.DecimalFormat;
import java.util.Map;

public class Order {
    private String id;
    private Map<PizzaDetail, Integer> pizzaMap;
    private Customer customer;
    private DecimalFormat amount;

    public Order(Map<PizzaDetail, Integer> pizzaMap, Customer customer) {
        this.pizzaMap = pizzaMap;
        this.customer = customer;
    }

    public Map<PizzaDetail, Integer> getPizzaMap() {
        return pizzaMap;
    }

    public void setPizzaMap(Map<PizzaDetail, Integer> pizzaMap) {
        this.pizzaMap = pizzaMap;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public DecimalFormat getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (amount != null ? !amount.equals(order.amount) : order.amount != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (pizzaMap != null ? !pizzaMap.equals(order.pizzaMap) : order.pizzaMap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pizzaMap != null ? pizzaMap.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
