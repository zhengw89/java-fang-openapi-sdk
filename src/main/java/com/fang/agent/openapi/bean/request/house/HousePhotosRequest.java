package com.fang.agent.openapi.bean.request.house;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HousePhotosRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "houseid")
	private int houseId;

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

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return super.argNullErrorMessage("房源类型");
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("房源类型", this.houseType);
		}
		return null;
	}

}
