package com.fang.agent.openapi.bean.response;

import com.google.gson.annotations.SerializedName;

/**
 * ���󷵻�ֵ����
 *
 * @param <T> �����������
 */
public abstract class BaseResponseBean<T> {
	
	/** ������״̬�� */
	private int code;
	
	/** ��������Ϣ */
	private String description;
	
	/** ���������� */
	@SerializedName(value = "returnmsgs")
	private T data;
	
	/**
	 * ����������״̬��
	 *
	 * @param code ״̬��
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * ��ȡ������״̬��
	 *
	 * @return ״̬��
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * ������������Ϣ
	 *
	 * @param description ��������Ϣ
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * ��ȡ��������Ϣ
	 *
	 * @return ��������Ϣ
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * ��������������
	 *
	 * @param msgs �������
	 */
	public void setData(T msgs) {
		this.data = msgs;
	}
	
	/**
	 * ��ȡ����������
	 *
	 * @return �������
	 */
	public T getData() {
		return this.data;
	}
}
