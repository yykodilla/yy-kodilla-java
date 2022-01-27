package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.simple.classes.Supplier;

public class OrderDto {
    public Supplier supplier;
    public boolean isOrdered;

    public OrderDto(final Supplier supplier, final boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
