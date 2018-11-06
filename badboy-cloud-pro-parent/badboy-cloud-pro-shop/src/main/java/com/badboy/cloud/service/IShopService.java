package com.badboy.cloud.service;

import java.util.List;

import com.badboy.cloud.domain.Shop;

public interface IShopService {
	public Shop getShopDetails(String shopNo);
	public List<Shop> getListShops(String userUUid);
}
