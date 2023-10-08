package com.springbootproject.amazon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.amazon.model.Order;

@Repository
public interface OrderDAO extends CrudRepository<Order, Integer> {

}
