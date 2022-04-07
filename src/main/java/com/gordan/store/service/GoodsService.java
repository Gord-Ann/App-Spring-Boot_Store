package com.gordan.store.service;

import com.gordan.store.models.Goods;

public interface GoodsService {

    Goods getGood(long id);

    Iterable<Goods> getAllGoods();
}
