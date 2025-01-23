package com.example.Shop888.dao;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ShopDao {
    private String shopId;
    private String ShopName;
}
