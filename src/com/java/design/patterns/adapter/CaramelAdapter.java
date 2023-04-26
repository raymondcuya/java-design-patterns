package com.java.design.patterns.adapter;

import com.java.design.patterns.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
