package com.badboy.cloud.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.badboy.cloud.domain.base.BaseEntey;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Order extends BaseEntey{
	
	@Getter@Setter
	private String userUUId;
	@Getter@Setter
	private String orderNo;
	@Getter@Setter
	private String orderName;
	@Getter@Setter
	private BigDecimal money;
	@Getter@Setter
	private Date orderDate;
}
