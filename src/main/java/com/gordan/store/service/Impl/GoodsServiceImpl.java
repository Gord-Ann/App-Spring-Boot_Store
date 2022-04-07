package com.gordan.store.service.Impl;

import com.gordan.store.models.Goods;
import com.gordan.store.repo.GoodsRepo;
import com.gordan.store.service.GoodsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GoodsServiceImpl implements GoodsService {

    private GoodsRepo goodsRepo;

    @Override
    public Goods getGood(long id) {
        return goodsRepo.findById(id).orElseThrow();
    }

    @Override
    public Iterable<Goods> getAllGoods() {
        return goodsRepo.findAll();
    }
}
