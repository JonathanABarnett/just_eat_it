package com.alaythiaproductions.justeatit.model;

public class AddOnModel {

    private String name;
    private Long price;

    public AddOnModel() {}

    public AddOnModel(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
