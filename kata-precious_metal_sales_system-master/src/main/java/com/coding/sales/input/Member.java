package com.coding.sales.input;

import java.math.BigDecimal;

/**
 * @author 
 *	会员信息
 */
/**
 * @author Jason
 *
 */
public class Member {
	private String vipName;//姓名
	private String vipLevel;//vip等级
	private String vipCode;//vip卡号
	private int vipPoints;//积分
//	private BigDecimal payMoney; //付款金额
	
	public String getVipName() {
		return vipName;
	}
	public void setVipName(String vipName) {
		this.vipName = vipName;
	}
	public String getVipLevel() {
		return vipLevel;
	}
	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}
	public String getVipCode() {
		return vipCode;
	}
	public void setVipCode(String vipCode) {
		this.vipCode = vipCode;
	}
	public int getVipPoints() {
		return vipPoints;
	}
	public void setVipPoints(int vipPoints) {
		this.vipPoints += vipPoints;
	}
	
	/*public BigDecimal getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}*/
	/**
	 * @param payMoney
	 * @param vipLevel
	 * 根据等级添加积分
	 */
	/*public void add(BigDecimal payMoney,String vipLevel){
		if(payMoney.intValue()<1){
			setVipPoints(0);//低于一元不积分
		}else{
			switch (vipLevel) {
			case "普通卡":
				setVipPoints(payMoney.intValue());
				break;
			case "金卡":
				setVipPoints((int)(Math.round(payMoney.intValue()*1.5)));
				break;
			case "白金卡":
				setVipPoints((int)(Math.round(payMoney.intValue()*1.8)));
				break;
			case "钻石卡":
				setVipPoints((int)(Math.round(payMoney.intValue()*2)));
				break;
			default:
				break;
			}
		}
	}*/
	
	
}
