package com.badboy.cloud.domain;

import java.util.Date;
import java.util.List;

import com.badboy.cloud.domain.base.BaseEntey;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User extends BaseEntey{
	@Getter@Setter
	private String uuid;
	@Getter@Setter
	private String name;
	@Getter@Setter
	private Date birthday;
	
	
	@Getter@Setter
	public List<Order> listOrder;
	@Getter@Setter
	public List<Shop> listShop;
}
