package com.tw.mpang.service;

import com.tw.mpang.constant.Description;
import com.tw.mpang.constant.PizzaDetail;

import java.util.HashMap;
import java.util.Map;

public class PrepareDataServiceImpl implements PrepareDataService{
    public Map<String, String> setSpecies() {
        Map<String, String> speciesMap = new HashMap<String, String>();
        speciesMap.put(PizzaDetail.Pizza_Species_BAKEWARE, Description.Pizza_Species_BAKEWARE_Description);
        speciesMap.put(PizzaDetail.Pizza_Species_CRISP, Description.Pizza_Species_CRISP_Description);
        speciesMap.put(PizzaDetail.Pizza_Species_THICK, Description.Pizza_Species_THICK_Description);
        return speciesMap;
    }

    public Map<String, String> setFlavour() {
        Map<String, String> flavourMap = new HashMap<String, String>();
        flavourMap.put(PizzaDetail.Pizza_Flavour_Cheese, Description.Pizza_Flavour_Cheese_Description);
        flavourMap.put(PizzaDetail.Pizza_Flavour_Hawaiian, Description.Pizza_Flavour_Hawaiian_Description);
        flavourMap.put(PizzaDetail.Pizza_Flavour_Meatza, Description.Pizza_Flavour_Meatza_Description);
        flavourMap.put(PizzaDetail.Pizza_Flavour_Mockba, Description.Pizza_Flavour_Mockba_Description);
        flavourMap.put(PizzaDetail.Pizza_Flavour_Neapolitan, Description.Pizza_Flavour_Neapolitan_Description);
        return flavourMap;
    }

    public Map<String, String> setSize() {
        Map<String, String> sizeMap = new HashMap<String, String>();
        sizeMap.put(PizzaDetail.Pizza_Size_19, Description.Pizza_Size_19_Description);
        sizeMap.put(PizzaDetail.Pizza_Size_23, Description.Pizza_Size_23_Description);
        sizeMap.put(PizzaDetail.Pizza_Size_29, Description.Pizza_Size_29_Description);
        return sizeMap;
    }
}
