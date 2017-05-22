package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HouseTitlePhotoModifyRequest extends BaseRequestBean {
	
	@Argument(name="houseType")
	private String houseType;

	@Argument(name="houseStatus")
	private int houseStatus;
	
	@Argument(name="photourl")
	private String photoUrl;
	
	@Argument(name="purposeType")
	private String purposeType;
	
	private List<Integer> houseIds;
	
	@Argument(name="houseid")
	private String houseIdStr;
	
	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public int getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(int houseStatus) {
		this.houseStatus = houseStatus;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	public List<Integer> getHouseIds() {
		return houseIds;
	}

	public void setHouseIds(List<Integer> houseIds) {
		this.houseIds = houseIds;
		this.houseIdStr=super.convertToStrWithCommaFromIntegers(houseIds);
	}

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if(!super.checkHouseStatusValueLegal(this.houseStatus)){
			return false;
		}
		if(StringUtil.isNullOrEmpty(this.photoUrl)){
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.purposeType)) {
			return false;
		}
		if (!super.checkPurposeTypeValueLegal(this.purposeType)) {
			return false;
		}
		if (this.houseIds == null || this.houseIds.size() == 0) {
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
		if(!super.checkHouseStatusValueLegal(this.houseStatus)){
			return super.argInvalidErrorMessage("��Դ״̬", this.houseStatus);
		}
		if(StringUtil.isNullOrEmpty(this.photoUrl)){
			return super.argNullErrorMessage("ͼƬ��ַ");
		}
		if (StringUtil.isNullOrEmpty(this.purposeType)) {
			return super.argNullErrorMessage("��ҵ����");
		}
		if (!super.checkPurposeTypeValueLegal(this.purposeType)) {
			return super.argInvalidErrorMessage("��ҵ����", this.purposeType);
		}
		if (this.houseIds == null || this.houseIds.size() == 0) {
			return super.argNullErrorMessage("��ԴID");
		}
		
		return null;
	}

}
