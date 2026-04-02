package com.ecom.Amazon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Amazon.entity.Amazon_Order;
import com.ecom.Amazon.repository.Order_Reposotiory;

@Service
public class Order_Services {

	@Autowired
	private Order_Reposotiory orderRepo;
	
//	@Autowired
//	private User_Repository userRepo;
	
	public String saveorder(Amazon_Order order)
	{
//		Amazon_User user = userRepo.findById(user_Id).get();
 
		System.out.println(order.getOrder_Id());
        orderRepo.save(order);
        return order.getName_order()+" Order Added Successfully..✅";
	}
	
	 public List<Amazon_Order> getAllOrders() {
	        return orderRepo.findAll();
	    }

	    public void deleteOrder(int id) {
	        orderRepo.deleteById(id);
	    }
}
