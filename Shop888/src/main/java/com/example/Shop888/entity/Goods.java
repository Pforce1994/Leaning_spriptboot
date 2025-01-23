package com.example.Shop888.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@Table(name = "goods")
@Entity
public class Goods {
    
    @Id
    @Column(name = "goods_id")
    private String goodsId;

    @Column(name = "goods_name")
    private String goodsName;

    @Column(name = "goods_price")
    private BigDecimal goodsPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "shop_id")
    private Shop shop;

}
