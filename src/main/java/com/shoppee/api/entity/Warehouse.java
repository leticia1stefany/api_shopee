package com.shoppee.api.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Warehouse {
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
