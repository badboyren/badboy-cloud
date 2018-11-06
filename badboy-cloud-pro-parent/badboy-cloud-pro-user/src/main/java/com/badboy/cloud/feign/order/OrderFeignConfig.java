package com.badboy.cloud.feign.order;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.badboy.cloud.domain.Order;

@Component
public class OrderFeignConfig implements OrderFeign{
	
	private final static Logger logger = LoggerFactory.getLogger(OrderFeignConfig.class);
	
	@Override
	public List<Order> getListOrder(String userUUid) {
		logger.info("OrderFeignConfig..........error");
		return new ArrayList<>();
	}

}
