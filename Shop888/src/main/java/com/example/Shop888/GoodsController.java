package com.example.Shop888;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Shop888.dao.GoodsDao;
import com.example.Shop888.dao.InsertGoodsDao;
import com.example.Shop888.entity.Goods;
import com.example.Shop888.entity.Shop;
import com.example.Shop888.repository.GoodsRepository;

@RestController
public class GoodsController {
    
    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/goods/{id}")
    public GoodsDao getGoods(
        @PathVariable("id") String id
    ){
        Goods goods = goodsRepository.findById(id).orElseThrow();
        return new GoodsDao()
            .setGoodsId(goods.getGoodsId())
            .setGoodsName(goods.getGoodsName())
            .setGoodsPrice(goods.getGoodsPrice())
            .setShopId(goods.getShop().getShopId())
            .setShopName(goods.getShop().getShopName());
    }

    @PostMapping("/goods/insert")
    public GoodsDao insertGoods(
        @RequestBody InsertGoodsDao insertGoodsDao
    ){
        Goods goods = new Goods()
            .setGoodsId(insertGoodsDao.getGoodsId())
            .setGoodsName(insertGoodsDao.getGoodsName())
            .setGoodsPrice(insertGoodsDao.getGoodsPrice())
            .setShop(new Shop().setShopId(insertGoodsDao.getShopId()));
            
        goods = goodsRepository.save(goods);

        return new GoodsDao()
            .setGoodsId(goods.getGoodsId())
            .setGoodsName(goods.getGoodsName())
            .setGoodsPrice(goods.getGoodsPrice())
            .setShopId(goods.getShop().getShopId())
            .setShopName(goods.getShop().getShopName());
    }
}
