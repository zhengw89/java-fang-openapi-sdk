package com.fang.agent.openapi.bean.request.agent;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;

public class AgentPortInfoRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseType() {
		return this.houseType;
	}

	@Override
	protected boolean validateBean() {
		if (!super.checkHouseTypeValueLegal(houseType)) {
			return false;
		}

		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (!super.checkHouseTypeValueLegal(houseType)) {
			return super.argInvalidErrorMessage("房源类型", houseType);
		}

		return null;
	}

}
