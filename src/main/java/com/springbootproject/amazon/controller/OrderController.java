package com.springbootproject.amazon.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbootproject.amazon.model.Order;
import com.springbootproject.amazon.service.OrderService;

@RestController
@RequestMapping(value = "/amazon")
public class OrderController {

	@Autowired
	private OrderService orderService;

	// create order
	@PostMapping(value = "/create")
	public Order createOrder(@RequestBody Order orderInput) {
		return orderService.createOrder(orderInput);
	}

	// retrieve all orders
	@GetMapping(value = "/all")
	public Iterable<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	// retrieve order by orderId
	@GetMapping(value = "/{orderId}")
	public Order getOrder(@PathVariable("orderId") Integer orderId) {
		return orderService.getOrder(orderId);
	}

	// Update order by payment type
	@PutMapping(value = "/update/{orderId}")
	public Order updateOrder(@PathVariable("orderId") Integer orderId, @RequestBody Map<String, String> requestBody) {
	    String paymentType = requestBody.get("paymentType");
	    return orderService.updateOrder(orderId, paymentType);
	}

	// delete order
	@DeleteMapping(value = "/{orderId}")
	public void deleteOrder(@PathVariable("orderId") Integer orderId) {
		orderService.deleteOrder(orderId);
	}

}
