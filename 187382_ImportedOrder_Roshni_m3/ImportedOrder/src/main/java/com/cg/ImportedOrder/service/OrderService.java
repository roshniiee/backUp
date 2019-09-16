package com.cg.ImportedOrder.service;

import java.util.List;

import com.cg.ImportedOrder.entity.Order;
import com.cg.ImportedOrder.exception.OrderException;

public interface OrderService {

	List<Order> CreateOrder(Order order) throws OrderException;

	List<Order> UpdateOrder(int id, Order uorder)throws OrderException;

	List<Order> viewAllOrder()throws OrderException;

	List<Order> viewByRange(int quantity1, int quantity2)throws OrderException;

	List<Order> viewAllByAmount(double amount)throws OrderException;

}
