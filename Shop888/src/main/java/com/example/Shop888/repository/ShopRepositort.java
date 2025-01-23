package com.example.Shop888.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Shop888.entity.Shop;

public interface ShopRepositort extends JpaRepository<Shop, String> {
    
}
