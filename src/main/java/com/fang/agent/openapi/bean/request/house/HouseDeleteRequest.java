package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HouseDeleteRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	private List<Integer> houseIds;

	@Argument(name = "houseid")
	private String houseIdStr;

	@Argument(name = "Flag")
	private int flag;

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

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.houseIdStr)) {
			return false;
		}
		if (this.flag != 0 && this.flag != 1) {
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
		if (StringUtil.isNullOrEmpty(this.houseIdStr)) {
			return super.argNullErrorMessage("房源ID");
		}
		if (this.flag != 0 && this.flag != 1) {
			return super.argInvalidErrorMessage("房源状态", this.flag);
		}
		return null;
	}

}
