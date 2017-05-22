package com.fang.agent.openapi.bean.response;

import com.google.gson.annotations.SerializedName;

/**
 * 请求返回值基类
 *
 * @param <T> 结果数据类型
 */
public abstract class BaseResponseBean<T> {
	
	/** 请求结果状态码 */
	private int code;
	
	/** 请求结果信息 */
	private String description;
	
	/** 请求结果数据 */
	@SerializedName(value = "returnmsgs")
	private T data;
	
	/**
	 * 设置请求结果状态码
	 *
	 * @param code 状态码
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * 获取请求结果状态码
	 *
	 * @return 状态码
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * 设置请求结果信息
	 *
	 * @param description 请求结果信息
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 获取请求结果信息
	 *
	 * @return 请求结果信息
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * 设置请求结果数据
	 *
	 * @param msgs 结果数据
	 */
	public void setData(T msgs) {
		this.data = msgs;
	}
	
	/**
	 * 获取请求结果数据
	 *
	 * @return 结果数据
	 */
	public T getData() {
		return this.data;
	}
}
