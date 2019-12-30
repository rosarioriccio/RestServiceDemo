package com.ap.RestServiceDemo.RestServiceDemo.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;

    private String name_shop;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.DETACH)
    @JsonManagedReference
    private List<Seller> Sellers;

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

    public List<Seller> getSellers() {
        return Sellers;
    }

    public void setSellers(List<Seller> sellers) {
        Sellers = sellers;
    }

    public Shop(Integer ID, String name_shop) {
        this.ID=ID;
        this.name_shop=name_shop;
    }

    public Shop() {
    }
}
