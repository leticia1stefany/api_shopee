package com.shoppee.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

public class Address {

    @OneToOne(mappedBy = "address")
    private Warehouse warehouse;
}
