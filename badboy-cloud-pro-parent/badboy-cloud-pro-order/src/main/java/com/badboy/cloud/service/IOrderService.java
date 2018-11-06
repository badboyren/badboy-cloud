package com.badboy.cloud.service;

import java.util.List;

import com.badboy.cloud.domain.Order;

public interface IOrderService {
	public List<Order> orderList(String uuid);
}
