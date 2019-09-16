package com.cg.ImportedOrder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ImportedOrder.dao.OrderDao;
import com.cg.ImportedOrder.entity.Order;
import com.cg.ImportedOrder.exception.OrderException;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao;
	int dollar = 75;

	@Override
	public List<Order> CreateOrder(Order order) throws OrderException { // create order method
		try {
			double amount = order.getPrice() * dollar * order.getQuantity();
			order.setAmount(amount);
			double charges = (amount * 1.25) / 100;
			order.setCharges(charges);
			orderDao.save(order);
			return orderDao.findAll();
		} catch (Exception e) {
			throw new OrderException(e.getMessage());
		}

	}

	@Override
	public List<Order> UpdateOrder(int id, Order uorder) throws OrderException { // update order method
		try {
			Optional<Order> optional = orderDao.findById(id);
			if (optional.isPresent()) {
				Order o = optional.get();
				o.setPrice(uorder.getPrice());
				o.setQuantity(uorder.getQuantity());
				double amount = uorder.getPrice() * dollar * uorder.getQuantity();
				o.setAmount(amount);
				double charges = (amount * 1.25) / 100;
				o.setCharges(charges);
				orderDao.save(o);

			}
			return orderDao.findAll();
		} catch (Exception e) {
			throw new OrderException(e.getMessage());
		}
	}

	@Override
	public List<Order> viewAllOrder() throws OrderException { // view all order method
		try {

			return orderDao.findAll();
		} catch (Exception e) {
			throw new OrderException(e.getMessage());
		}

	}

	@Override
	public List<Order> viewByRange(int quantity1, int quantity2) throws OrderException { // view by range method
		try {
			return orderDao.viewByRange(quantity1, quantity2);
		} catch (Exception e) {
			throw new OrderException(e.getMessage());
		}

	}

	@Override
	public List<Order> viewAllByAmount(double amount) throws OrderException { // view by amount method
		try {
			return orderDao.viewAllByAmount(amount);
		} catch (Exception e) {
			throw new OrderException(e.getMessage());
		}

	}
}
