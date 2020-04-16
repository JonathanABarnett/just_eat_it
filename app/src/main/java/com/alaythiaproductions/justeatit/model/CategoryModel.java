package com.alaythiaproductions.justeatit.model;

import java.util.List;

public class CategoryModel {

    private String menuId, name, image;
    List<FoodModel> foods;

    public CategoryModel() {}

    public CategoryModel(String menuId, String name, String image, List<FoodModel> foods) {
        this.menuId = menuId;
        this.name = name;
        this.image = image;
        this.foods = foods;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
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

    public List<FoodModel> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodModel> foods) {
        this.foods = foods;
    }
}
