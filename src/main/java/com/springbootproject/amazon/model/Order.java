package com.springbootproject.amazon.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Integer orderId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "products")
	private List<String> products;

	@Column(name = "order_total")
	private String orderTotal;

	@Column(name = "payment_type")
	private String paymentType;

	public Order() {

	}

	public Order(Integer orderId, String customerName, List<String> products, String orderTotal, String paymentType) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.products = products;
		this.orderTotal = orderTotal;
		this.paymentType = paymentType;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public List<String> getProducts() {
		return products;
	}

	public String getOrderTotal() {
		return orderTotal;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	public void setOrderTotal(String orderTotal) {
		this.orderTotal = orderTotal;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}
