package com.ap.RestServiceDemo.RestServiceDemo.Repository;

import com.ap.RestServiceDemo.RestServiceDemo.Model.Seller;
import com.ap.RestServiceDemo.RestServiceDemo.Model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sellerRepository")
public interface SellerRepository extends JpaRepository<Seller,Integer> {
    public List<Seller> findByShop(Shop shop);
}
