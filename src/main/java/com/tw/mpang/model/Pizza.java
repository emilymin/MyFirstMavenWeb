package com.tw.mpang.model;

import com.tw.mpang.constant.PizzaDetail;

import java.io.Serializable;

public class Pizza implements Serializable{
    private static final long serialVersionUID = 1951520003958305899L;

    private String species;
    private PizzaDetail flavour;
    private PizzaDetail size;

    public Pizza() {
        System.out.println(String.format("constructor: this is pizza %s", this));

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "species='" + species + '\'' +
                ", flavour=" + flavour +
                ", size=" + size +
                '}' + super.toString();
    }

    public Pizza(String species, PizzaDetail flavour, PizzaDetail size) {
        this.species = species;
        this.flavour = flavour;
        this.size = size;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSpecies() {
        System.out.println(String.format("this is my pizza %s", species));
        System.out.println(String.format("this is pizza %s", this));
        return species;
    }

    public void setSpecies(String species) {
        System.out.println(String.format("set speciese is pizza %s", species));
        this.species = species;
    }

    public PizzaDetail getFlavour() {
        return flavour;
    }

    public void setFlavour(PizzaDetail flavour) {
        this.flavour = flavour;
    }

    public PizzaDetail getSize() {
        return size;
    }

    public void setSize(PizzaDetail size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizza)) return false;

        Pizza pizza = (Pizza) o;

        if (flavour != null ? !flavour.equals(pizza.flavour) : pizza.flavour != null) return false;
        if (size != null ? !size.equals(pizza.size) : pizza.size != null) return false;
        if (species != null ? !species.equals(pizza.species) : pizza.species != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = species != null ? species.hashCode() : 0;
        result = 31 * result + (flavour != null ? flavour.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
