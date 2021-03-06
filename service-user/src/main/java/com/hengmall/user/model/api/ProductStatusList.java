package com.hengmall.user.model.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Administrator on 2018/5/25.
 */
@ApiModel
public class ProductStatusList {

	// 1：待付款，2：待发货，3：待收货，4：已收货
	public static final int PENDING_STATUS = 0;
	public static final int DELIVERY_STATUS = 1;
	public static final int UNCOLLECTED_GOODS_STATUS = 2;
	public static final int RECEIVED_STATUS = 3;

	@ApiModelProperty(value = "商品主键id")
	int id;
	@ApiModelProperty(value = "商品名称")
	String name;
	@ApiModelProperty(value = "商品图片")
	String headimg;
	@ApiModelProperty(value = "价格")
	double price;
	@ApiModelProperty(value = "状态码；0：待付款，1：待发货，2：待收货，3：已收货")
	int status;

	@Override
	public String toString() {
		return "ProductListResp{" + "id=" + id + ", name='" + name + '\'' + ", headimg='" + headimg + '\'' + ", price="
				+ price + ", status=" + status + '}';
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadimg() {
		return headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
