package com.gordan.store.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @JsonManagedReference
    @OneToMany
    private List<Goods> orderGoods;

    @Transient
    public int getNumberOfGoods() {
        return this.orderGoods.size();
    }
}
