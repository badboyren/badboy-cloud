package com.badboy.cloud.feign.shop;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import com.badboy.cloud.domain.Shop;
import com.badboy.cloud.feign.FeignConfig;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@FeignClient(value = "badboy-cloud-pro-shop", configuration = FeignConfig.class, fallback = ShopFeignConfig.class)
@Headers("Content-type: application/json")
public interface ShopFeign {
	
	@RequestLine("GET /shopList/{userUUid}")
	public List<Shop> getListOrder(@Param("userUUid") String userUUid);
}
