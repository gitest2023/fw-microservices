package com.hdsaison.microservices.hds.common.services.impl;

import com.hdsaison.microservices.hds.common.services.Excel;

public class ExcelImpl implements Excel {
    @Override
    public void export() {
        System.out.println("Exported");
    }
}
