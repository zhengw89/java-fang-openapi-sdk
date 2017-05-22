package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HousePhotoDelRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "houseid")
	private int houseId;

	@Argument(name = "houseStatus")
	private int houseStatus;

	@Argument(name = "purposeType")
	private String purposeType;

	private List<Integer> photoIds;

	@Argument(name = "photoids")
	private String photoIdStr;

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

	public String getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	public List<Integer> getPhotoIds() {
		return photoIds;
	}

	public void setPhotoIds(List<Integer> photoIds) {
		this.photoIds = photoIds;
		this.photoIdStr = super.convertToStrWithCommaFromIntegers(photoIds);
	}

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.purposeType)) {
			return false;
		}
		if (super.checkPurposeTypeValueLegal(this.purposeType)) {
			return false;
		}
		if (this.photoIds == null || this.photoIds.size() == 0) {
			return false;
		}

		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return super.argNullErrorMessage("房源类型");
		}
		if (super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("房源类型", this.houseType);
		}
		if (StringUtil.isNullOrEmpty(this.purposeType)) {
			return super.argNullErrorMessage("物业类型");
		}
		if (super.checkPurposeTypeValueLegal(this.purposeType)) {
			return super.argInvalidErrorMessage("物业类型", this.purposeType);
		}
		if (this.photoIds == null || this.photoIds.size() == 0) {
			return super.argNullErrorMessage("图片列表");
		}

		return null;
	}

}
