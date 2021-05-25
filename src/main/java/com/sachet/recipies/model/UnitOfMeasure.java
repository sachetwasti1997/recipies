package com.sachet.recipies.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "unit_of_measure")
public class UnitOfMeasure extends BaseEntity {

    @Column(name = "uom")
    private String uom;

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
