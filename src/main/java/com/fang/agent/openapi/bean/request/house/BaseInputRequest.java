package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public abstract class BaseInputRequest extends BaseRequestBean {

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "purposeType")
	private String purposeType;

	@Argument(name = "projname")
	private String projName;

	@Argument(name = "district")
	private String district;

	@Argument(name = "comarea")
	private String comarea;

	@Argument(name = "address")
	private String address;

	@Argument(name = "price")
	private double price;

	@Argument(name = "buildingarea")
	private double buildingArea;

	@Argument(name = "allfloor")
	private int allFloor;

	@Argument(name = "innerid")
	private String innerid;

	@Argument(name = "trafficinfo")
	private String trafficInfo;

	@Argument(name = "subwayinfo")
	private String subwayInfo;

	@Argument(name = "title")
	private String title;

	@Argument(name = "content")
	private String content;

	@Argument(name = "infocode")
	private String infoCode;

	@Argument(name = "flag")
	private String flag;

	@Argument(name = "photourl")
	private String titleImgUrl;

	protected BaseInputRequest(String houseType, String purposeType) {
		this.houseType = houseType;
		this.purposeType = purposeType;
	}

	public String getHouseType() {
		return houseType;
	}

	 public void setHouseType(String houseType) {
	 this.houseType = houseType;
	 }

	public String getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComarea() {
		return comarea;
	}

	public void setComarea(String comarea) {
		this.comarea = comarea;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getBuildingArea() {
		return buildingArea;
	}

	public void setBuildingArea(double buildingArea) {
		this.buildingArea = buildingArea;
	}

	public int getAllFloor() {
		return allFloor;
	}

	public void setAllFloor(int allFloor) {
		this.allFloor = allFloor;
	}

	public String getInnerid() {
		return innerid;
	}

	public void setInnerid(String innerid) {
		this.innerid = innerid;
	}

	public String getTrafficInfo() {
		return trafficInfo;
	}

	public void setTrafficInfo(String trafficInfo) {
		this.trafficInfo = trafficInfo;
	}

	public String getSubwayInfo() {
		return subwayInfo;
	}

	public void setSubwayInfo(String subwayInfo) {
		this.subwayInfo = subwayInfo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInfoCode() {
		return infoCode;
	}

	public void setInfoCode(String infocode) {
		this.infoCode = infocode;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getTitleImgUrl() {
		return titleImgUrl;
	}

	public void setTitleImgUrl(String titleImgUrl) {
		this.titleImgUrl = titleImgUrl;
	}

	@Override
	protected boolean validateBean() {
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (!super.checkPurposeTypeValueLegal(this.purposeType)) {
			return false;
		}
		if(StringUtil.isNullOrEmpty(this.title)){
			return false;
		}
		if(StringUtil.isNullOrEmpty(this.content)){
			return false;
		}
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("房源类型", this.houseType);
		}
		if (!super.checkPurposeTypeValueLegal(this.purposeType)) {
			return super.argInvalidErrorMessage("物业类型", this.purposeType);
		}
		if(StringUtil.isNullOrEmpty(this.title)){
			return super.argNullErrorMessage("标题");
		}
		if(StringUtil.isNullOrEmpty(this.content)){
			return super.argNullErrorMessage("描述");
		}
		return null;
	}

	protected final String convertToImgArg(List<ImgInfo> imgs) {
		if (imgs == null)
			return null;

		StringBuilder sb = new StringBuilder();
		for (ImgInfo img : imgs) {
			sb.append(String.format("%d~%d,", img.getUrl(), img.getName()));
		}

		return StringUtil.trimEnd(sb.toString(), ",");
	}

}
