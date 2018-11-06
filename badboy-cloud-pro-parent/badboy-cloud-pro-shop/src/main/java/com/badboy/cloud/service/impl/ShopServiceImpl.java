package com.badboy.cloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.badboy.cloud.domain.Shop;
import com.badboy.cloud.service.IShopService;

@Service
public class ShopServiceImpl implements IShopService {

	@Override
	public Shop getShopDetails(String shopNo) {
		
		Shop shop = new Shop();
		shop.setOrderNum(1);
		shop.setProductId("productID:"+shopNo);
		shop.setProductImg("www.baidu.com/i.jpg");
		shop.setProductName("商品名称:"+shopNo);
		shop.setShopNo("shopNo:"+shopNo);
		shop.setUserUUId("userUUID:"+shopNo);
		
		return shop;
	}

	@Override
	public List<Shop> getListShops(String userUUid) {
		List<Shop> list = new ArrayList<Shop>();
		Shop shop = null;
		for(int i=0;i<5;i++) {
			shop = new Shop();
			shop.setOrderNum(1);
			shop.setProductId("productID:"+userUUid +i);
			shop.setProductImg("www.baidu.com/i.jpg");
			shop.setProductName("商品名称:"+userUUid + i);
			shop.setShopNo("shopNo:"+userUUid);
			shop.setUserUUId("userUUID:"+userUUid);
			
			list.add(shop);
		}
		return list;
	}

}
