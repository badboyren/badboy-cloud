package com.badboy.cloud.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.badboy.cloud.domain.Order;
import com.badboy.cloud.feign.shop.ShopFeign;
import com.badboy.cloud.service.IOrderService;

@RestController
public class OrderController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource 
	private IOrderService orderService;
	
	@Autowired
	private ShopFeign shopFeigen;
	
	@GetMapping(value="/orderList/{uuid}")
	public List<Order> index(HttpServletRequest request,
					@PathVariable String uuid) {
		
		logger.info("Say:{}","/orderList/{uuid}");
		logger.info("<call 2223 TraceId={},SpanId={}>",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
		
		System.out.println(shopFeigen.getListOrder(uuid));
		
		return orderService.orderList(uuid);
	}
}
