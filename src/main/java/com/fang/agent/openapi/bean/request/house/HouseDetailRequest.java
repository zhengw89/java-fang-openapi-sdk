package com.fang.agent.openapi.bean.request.house;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HouseDetailRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "houseId")
	private int houseId;

	@Argument(name = "houseStatus")
	private int houseStatus;

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public int getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(int houseStatus) {
		this.houseStatus = houseStatus;
	}

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (!super.checkHouseStatusValueLegal(this.houseStatus)) {
			return false;
		}
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return super.argNullErrorMessage("��Դ����");
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("��Դ����", this.houseType);
		}
		if (!super.checkHouseStatusValueLegal(this.houseStatus)) {
			return super.argInvalidErrorMessage("��Դ״̬", this.houseStatus);
		}
		return null;
	}
}
