package com.alaythiaproductions.justeatit.model;

import android.widget.LinearLayout;

import java.util.List;

public class FoodModel {

    String name, image, id, description;
    private Long price;
    private List<AddOnModel> addOn;
    private List<SizeModel> size;

    public FoodModel() {}

    public FoodModel(String name, String image, String id, String description, Long price, List<AddOnModel> addOn, List<SizeModel> size) {
        this.name = name;
        this.image = image;
        this.id = id;
        this.description = description;
        this.price = price;
        this.addOn = addOn;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public List<AddOnModel> getAddOn() {
        return addOn;
    }

    public void setAddOn(List<AddOnModel> addOn) {
        this.addOn = addOn;
    }

    public List<SizeModel> getSize() {
        return size;
    }

    public void setSize(List<SizeModel> size) {
        this.size = size;
    }
}
