package com.gordan.store.controllers;

import com.gordan.store.models.Goods;
import com.gordan.store.repo.GoodsRepo;
import com.gordan.store.service.GoodsService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/goods")
@AllArgsConstructor
public class GoodsController {

    private final GoodsRepo goodsRepo;
    private final GoodsService goodsService;

    @GetMapping(value = { "", "/" })
    public @NotNull
    Iterable<Goods> getGoods() {
        return goodsService.getAllGoods();
    }
}
