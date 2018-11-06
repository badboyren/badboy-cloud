package com.badboy.cloud.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.badboy.cloud.domain.Shop;
import com.badboy.cloud.service.IShopService;

@RestController
public class ShopController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource 
	private IShopService shopService;
	
	@GetMapping(value="/getShopInfo/{shopNo}")
	public Shop getShopInfo(HttpServletRequest request,
					@PathVariable String shopNo) {
		
		logger.info("Say:{}","/getInfo/{uuid}");
		logger.info("<call 2223 TraceId={},SpanId={}>",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
		
		return shopService.getShopDetails(shopNo);
	}
	
	@GetMapping(value="/shopList/{userUUId}")
	public List<Shop> shopList(HttpServletRequest request,
					@PathVariable String userUUId) {
		
		logger.info("Say:{}","/getInfo/{uuid}");
		logger.info("<call 2223 TraceId={},SpanId={}>",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
		
		return shopService.getListShops(userUUId);
	}
}
