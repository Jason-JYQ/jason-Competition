package com.coding.sales.input;

import java.math.BigDecimal;

/**
 * @author 
 *	贵金属类
 */
public class NobleMetal {
	/*
	 * * 守扩之羽比翼双飞4.8g
		* 编号：002001
		* 单位：条
		* 价格：1080.00
		* 参与满减：第3件半价，满3送1
		* 可使用95折打折券
	 */
	private String itemName; //名称
	private String itemNUm; //数量
	private String itemUnit; //单位
	private BigDecimal itemPrice; //价格
	private String type; //是否参与满减 // 0第三件半价，1满3送1,2满3000减350,3满2000减20,4满1000减10,5不参与满减
	private String coupon; //优惠券 //a.95折，b.9折，c.不打折
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemNUm() {
		return itemNUm;
	}
	public void setItemNUm(String itemNUm) {
		this.itemNUm = itemNUm;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	
	
}
