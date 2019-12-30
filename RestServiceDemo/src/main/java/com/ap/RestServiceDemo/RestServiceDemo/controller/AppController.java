package com.ap.RestServiceDemo.RestServiceDemo.controller;

import com.ap.RestServiceDemo.RestServiceDemo.Model.Shop;
import com.ap.RestServiceDemo.RestServiceDemo.Repository.SellerRepository;
import com.ap.RestServiceDemo.RestServiceDemo.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ShopRepository shopRepository;

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        List<Shop> shops = shopRepository.findAll();
        mav.setViewName("home");
        mav.addObject("shops",shops);
        return mav;
    }
}
