package com.gordan.store.repo;

import com.gordan.store.models.Customer;
import com.gordan.store.models.Goods;
import org.springframework.data.repository.CrudRepository;

public interface GoodsRepo extends CrudRepository<Goods, Long> {
}
