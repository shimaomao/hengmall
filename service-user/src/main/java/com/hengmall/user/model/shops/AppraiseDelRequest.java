package com.server.entity.shops;

import io.swagger.annotations.ApiModelProperty;

/**
 * 店铺商品评论删除 entity  请求需要的参数
 * @author Administrator
 *
 */
public class AppraiseDelRequest {
	
	@ApiModelProperty(value = "评论id")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}