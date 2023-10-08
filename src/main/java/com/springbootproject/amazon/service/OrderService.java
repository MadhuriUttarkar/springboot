package com.springbootproject.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbootproject.amazon.dao.OrderDAO;
import com.springbootproject.amazon.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderDAO orderDAO;

	public Order createOrder(Order orderInput) {

		return orderDAO.save(orderInput);
	}

	public Iterable<Order> getAllOrders() {

		return orderDAO.findAll();
	}

	public Order getOrder(Integer orderId) {

		return orderDAO.findById(orderId).orElse(new Order());
	}

	public void deleteOrder(Integer orderId) {
		orderDAO.deleteById(orderId);

	}

	public Order updateOrder(Integer orderId, String paymentType) {
		Order order = getOrder(orderId);
        order.setPaymentType(paymentType);
        return orderDAO.save(order);
	}

}
