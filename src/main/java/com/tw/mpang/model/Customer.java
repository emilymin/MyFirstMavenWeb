package com.tw.mpang.model;

import java.text.DecimalFormat;

public class Customer {
    private String name;
    private DecimalFormat tel;
    private String address;

    public Customer(String name, DecimalFormat tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DecimalFormat getTel() {
        return tel;
    }

    public void setTel(DecimalFormat tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (tel != null ? !tel.equals(customer.tel) : customer.tel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
