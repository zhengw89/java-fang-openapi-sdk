package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HouseRefreshRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "houseids")
	private String houseIdsStr;

	private List<Integer> houseIds;

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseIdsStr() {
		return houseIdsStr;
	}

	public List<Integer> getHouseIds() {
		return houseIds;
	}

	public void setHouseIds(List<Integer> houseIds) {
		this.houseIds = houseIds;
		this.houseIdsStr = super.convertToStrWithCommaFromIntegers(houseIds);
	}

	@Override
	protected boolean validateBean() {
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.houseIdsStr)) {
			return false;
		}
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("房源类型", this.houseType);
		}
		if (StringUtil.isNullOrEmpty(this.houseIdsStr)) {
			return super.argNullErrorMessage("房源ID");
		}
		return null;
	}

}
