package com.example.Shop888.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shop888.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, String> {
    
}
