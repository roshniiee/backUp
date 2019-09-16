package com.cg.ImportedOrder.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ImportedOrder.entity.Order;
import com.cg.ImportedOrder.exception.OrderException;
import com.cg.ImportedOrder.service.OrderService;

@RestController
public class OrderController {
	@ResponseStatus(value=HttpStatus.NOT_FOUND,
		reason="Invalid input")
	@ExceptionHandler({Exception.class})
public void handleException() {
		
	} //controllerException
	
	
	@Autowired
	OrderService orderService;

	@PostMapping("/addorder")
	public List<Order> CreateOrder(@RequestBody Order order) throws OrderException { //create order method
		return orderService.CreateOrder(order);
	}

	@PutMapping("/updateorder/{id}")
	public List<Order> UpdateOrder(@PathVariable int id, @RequestBody Order uorder)throws OrderException { //update  order method
		return orderService.UpdateOrder(id, uorder);
	}

	@RequestMapping("/viewallorder")
	public List<Order> viewAllOrder() throws OrderException{ //view all order method
		return orderService.viewAllOrder();
	}

	@RequestMapping("/viewbyrange/{quantity1}/{quantity2}")
	public List<Order> viewByRange(@PathVariable int quantity1, @PathVariable int quantity2)throws OrderException { //view by range method
		return orderService.viewByRange(quantity1, quantity2);
	}
	@RequestMapping("/viewallbyamount/{amount}")
	public List<Order> viewAllByAmount(@Valid @PathVariable double amount)throws OrderException{//view all by amount method
		return orderService.viewAllByAmount(amount);
	}
}
