package com.badboy.cloud.feign.order;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.badboy.cloud.domain.Order;
import com.badboy.cloud.feign.FeignConfig;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@FeignClient(value = "badboy-cloud-pro-order", configuration = FeignConfig.class, fallback = OrderFeignConfig.class)
@Headers("Content-type: application/json")
public interface OrderFeign {

	@RequestLine("GET /orderList/{userUUid}")
	public List<Order> getListOrder(@Param("userUUid") String userUUid);
	
}
