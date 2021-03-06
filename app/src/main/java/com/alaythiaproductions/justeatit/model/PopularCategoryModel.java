package com.alaythiaproductions.justeatit.model;

public class PopularCategoryModel {

    private String menuId, foodId, name, image;

    public PopularCategoryModel() {}

    public PopularCategoryModel(String menuId, String foodId, String name, String image) {
        this.menuId = menuId;
        this.foodId = foodId;
        this.name = name;
        this.image = image;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
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
}
