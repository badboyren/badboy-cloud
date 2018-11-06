package com.badboy.cloud.domain;

import java.io.Serializable;

import com.badboy.cloud.domain.base.BaseEntey;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Shop extends BaseEntey{
	
	@Getter@Setter
	private String userUUId;
	@Getter@Setter
	private String shopNo;
	@Getter@Setter
	private String productId;
	@Getter@Setter
	private String productName;
	@Getter@Setter
	private int orderNum;
	@Getter@Setter
	private String productImg;
}
