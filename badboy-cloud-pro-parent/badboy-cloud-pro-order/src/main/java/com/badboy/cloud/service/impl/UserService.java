package com.badboy.cloud.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.badboy.cloud.domain.Order;
import com.badboy.cloud.service.IOrderService;

@Service
public class UserService implements IOrderService {

	@Override
	public List<Order> orderList(String uuid) {
		List<Order> list = new ArrayList<Order>();
		Order order = null;
		for(int i=0;i<3;i++) {
			order = new Order();
			order.setUserUUId(uuid);
			order.setOrderNo("orderNo:"+uuid);
			order.setOrderDate(new Date());
			order.setMoney(new BigDecimal(Math.random()));
			order.setOrderName("orderName:"+uuid);
			list.add(order);
		}
		return list;
	}


}
