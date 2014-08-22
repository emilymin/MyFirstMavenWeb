package com.tw.mpang.model;

import com.tw.mpang.constant.Constant;

import java.io.Serializable;

public class Pizza implements Serializable{
    private static final long serialVersionUID = 1951520003958305899L;

    private Constant species;
    private Constant flavour;
    private Constant size;

    public Pizza(Constant species, Constant flavour, Constant size) {
        this.species = species;
        this.flavour = flavour;
        this.size = size;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Constant getSpecies() {
        return species;
    }

    public void setSpecies(Constant species) {
        this.species = species;
    }

    public Constant getFlavour() {
        return flavour;
    }

    public void setFlavour(Constant flavour) {
        this.flavour = flavour;
    }

    public Constant getSize() {
        return size;
    }

    public void setSize(Constant size) {
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
