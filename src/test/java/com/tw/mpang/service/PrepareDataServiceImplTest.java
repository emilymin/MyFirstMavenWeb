package com.tw.mpang.service;

import com.tw.mpang.constant.Description;
import com.tw.mpang.constant.PizzaDetail;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrepareDataServiceImplTest {

    @Test
    public void testSetSpecies() throws Exception {
        PrepareDataServiceImpl prepareDataService = new PrepareDataServiceImpl();

        Map<String, String> speciesMap = new HashMap<String, String>();
        speciesMap.put(PizzaDetail.Pizza_Species_BAKEWARE, Description.Pizza_Species_BAKEWARE_Description);
        speciesMap.put(PizzaDetail.Pizza_Species_CRISP, Description.Pizza_Species_CRISP_Description);
        speciesMap.put(PizzaDetail.Pizza_Species_THICK, Description.Pizza_Species_THICK_Description);

        assertThat(prepareDataService.setSpecies(), is(speciesMap));
    }

    @Test
    public void testSetFlavour() throws Exception {

    }

    @Test
    public void testSetSize() throws Exception {

    }
}