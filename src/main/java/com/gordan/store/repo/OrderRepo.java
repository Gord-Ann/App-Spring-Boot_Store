package com.gordan.store.repo;

import com.gordan.store.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {

}
