package com.example.Shop888.dao;

import java.math.BigDecimal;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class InsertGoodsDao {
    
    private String goodsId;
    private String goodsName;
    private BigDecimal goodsPrice;
    private String shopId;

}
