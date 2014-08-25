package com.tw.mpang.constant;

public class Species {
    private String BAKEWARE = PizzaDetail.Pizza_Species_BAKEWARE;
    private String THICK = PizzaDetail.Pizza_Species_THICK;
    private String CRISP = PizzaDetail.Pizza_Species_CRISP;
    private String BAKEWARE_DESCRIPTION = Description.Pizza_Species_BAKEWARE_Description;
    private String CRISP_DESCRIPTION = Description.Pizza_Species_CRISP_Description;
    private String THICK_DESCRIPTION = Description.Pizza_Species_THICK_Description;

    public Species() {
    }

    public String getBAKEWARE() {
        return BAKEWARE;
    }

    public String getTHICK() {
        return THICK;
    }

    public String getCRISP() {
        return CRISP;
    }

    public String getBAKEWARE_DESCRIPTION() {
        return BAKEWARE_DESCRIPTION;
    }

    public String getCRISP_DESCRIPTION() {
        return CRISP_DESCRIPTION;
    }

    public String getTHICK_DESCRIPTION() {
        return THICK_DESCRIPTION;
    }
}
