package com.ap.RestServiceDemo.RestServiceDemo.Repository;

import com.ap.RestServiceDemo.RestServiceDemo.Model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("shopRepository")
public interface ShopRepository extends JpaRepository<Shop,Integer> {
}
