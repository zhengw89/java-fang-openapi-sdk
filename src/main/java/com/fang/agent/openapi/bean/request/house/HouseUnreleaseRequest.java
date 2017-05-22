package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HouseUnreleaseRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	private List<Integer> houseIds;

	@Argument(name = "houseids")
	private String houseIdStr;

	@Argument(name = "action")
	private final String action;

	@Argument(name = "flag")
	private int houseStatus;

	public HouseUnreleaseRequest() {
		action = "releasehouse";
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public List<Integer> getHouseIds() {
		return houseIds;
	}

	public void setHouseIds(List<Integer> houseIds) {
		this.houseIds = houseIds;
		this.houseIdStr = super.convertToStrWithCommaFromIntegers(houseIds);
	}

	public int getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(int houseStatus) {
		this.houseStatus = houseStatus;
	}

	public String getAction() {
		return action;
	}

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (this.houseIds == null || this.houseIds.size() == 0) {
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
			return super.argInvalidErrorMessage("房源类型", this.houseType);
		}
		if (this.houseIds == null || this.houseIds.size() == 0) {
			return super.argNullErrorMessage("房源ID");
		}
		if (!super.checkHouseStatusValueLegal(this.houseStatus)) {
			return super.argInvalidErrorMessage("房源状态", this.houseStatus);
		}
		return null;
	}
}
