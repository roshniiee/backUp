package com.cg.ImportedOrder.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ImportedOrder.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
//query to find order by id from the list
	@Query("from Order where orderid=:id")
	Optional<Order> findById(@Param("id") int id);

//query to find all the orders in the list
	@Query("from Order")
	List<Order> findAll();

//query to view orders within the given range of quantity 
	@Query("from Order order where order.quantity between :quantity1 and :quantity2")
	List<Order> viewByRange(@Param("quantity1") int quantity1, @Param("quantity2") int quantity2);

//query to view orders with amount greater than given amount
	@Query("from Order order where order.amount > :amount")
	List<Order> viewAllByAmount(@Param("amount") double amount);
}
