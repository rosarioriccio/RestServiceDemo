package com.ap.RestServiceDemo.RestServiceDemo.Model;

import javax.persistence.*;

public class SellerAJ {
    private Integer ID;
    private String name;
    private Shop shop;

    public SellerAJ(Integer ID, String name, Shop shop) {
        this.ID = ID;
        this.name = name;
        this.shop = shop;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
