package com.hueason.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hueason.pojo.product.Sku;

/**
 * 购物车
 * @author lx
 *
 */
public class BuyerCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//第一部分 集合
	private List<BuyerItem> items = new ArrayList<BuyerItem>();
	
	
	//添加购物项
	public void addItem(Long skuId,Integer amount){
		Sku sku = new Sku();
		sku.setId(skuId);
		BuyerItem item = new BuyerItem();
		item.setSku(sku);
		item.setAmount(amount);
		
		if(items.contains(item)){
			//数量追加
			for (BuyerItem it : items) {
				if(it.equals(item)){
					it.setAmount(it.getAmount() + item.getAmount());
					break;
				}
			}
		}else{
			//加入集合
			items.add(item);
		}
	}

	public List<BuyerItem> getItems() {
		return items;
	}

	public void setItems(List<BuyerItem> items) {
		this.items = items;
	}
	
	//第二部分 小计     转JSOn的POJO 必须为标准POJO  声明  set get  转JSON格式字符串抛出JSON转换异常
	//商品数量 
	@JsonIgnore
	public Integer getProductAmount(){
		Integer result = 0;
		for (BuyerItem item : items) {
			result += item.getAmount();
		}
		return result;
	}
	
	//商品金额
	@JsonIgnore
	public Float getProductPrice(){
		Float result = 0f;
		for (BuyerItem item : items) {
			result += item.getSku().getPrice()*item.getAmount();
		}
		return result;
	}
	
	//运费
	@JsonIgnore
	public Float getFee(){
		Float result = 0f;
		if(getProductPrice() < 99){
			result = 6f;
		}
		return result;
	}
	
	//总计
	@JsonIgnore
	public Float getTotalPrice(){
		return getProductPrice() + getFee();
	}
	
	
	
	
	
	
	
	
}
