package com.badboy.cloud.feign.shop;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.badboy.cloud.domain.Shop;

@Component
public class ShopFeignConfig implements ShopFeign{
	
	private final static Logger logger = LoggerFactory.getLogger(ShopFeignConfig.class);
	
	@Override
	public List<Shop> getListOrder(String userUUid) {
		
		logger.info("ShopFeignConfig..........error");
		
		return new ArrayList<>();
	}

}
