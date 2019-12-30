package com.ap.RestServiceDemo.RestServiceDemo.Model;

public class ShopAJ {
    private Integer ID;
    private String name_shop;

    public ShopAJ(Integer ID, String name_shop) {
        this.ID = ID;
        this.name_shop = name_shop;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName_shop() {
        return name_shop;
    }

    public void setName_shop(String name_shop) {
        this.name_shop = name_shop;
    }
}
