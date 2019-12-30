package com.ap.RestServiceDemo.RestServiceDemo.controller;

import com.ap.RestServiceDemo.RestServiceDemo.Model.Seller;
import com.ap.RestServiceDemo.RestServiceDemo.Model.SellerAJ;
import com.ap.RestServiceDemo.RestServiceDemo.Model.Shop;
import com.ap.RestServiceDemo.RestServiceDemo.Model.ShopAJ;
import com.ap.RestServiceDemo.RestServiceDemo.Repository.SellerRepository;
import com.ap.RestServiceDemo.RestServiceDemo.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestServiceController {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ShopRepository shopRepository;

    @PostMapping(value = "/sellers")
    @ResponseBody
    public List<SellerAJ> getSellersByShop(@RequestBody ShopAJ shopAJ){
        System.out.println(shopAJ.getID());
        Shop shop = shopRepository.findById(shopAJ.getID()).get();
        List<Seller> sellers = sellerRepository.findByShop(shop);
        System.out.println(sellers.get(0).getName());
        List<SellerAJ> sellerAJ = new ArrayList<>();
        for(int i = 0 ; i < sellers.size();i++){
            SellerAJ s = new SellerAJ(sellers.get(i).getID(),sellers.get(i).getName(),sellers.get(i).getShop());
            sellerAJ.add(s);
        }
        return sellerAJ;
    }
}
