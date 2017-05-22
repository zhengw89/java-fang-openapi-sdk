package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;

public class SaleHouseInputRequest extends BaseInputRequest {

	@Argument(name = "createtime")
	private Integer createTime;

	@Argument(name = "livearea")
	private Double liveArea;

	private List<String> baseService;

	@Argument(name = "baseservice")
	private String baseServiceStr;

	private List<String> houseTags;

	@Argument(name = "features")
	private String houseTagsStr;

	@Argument(name = "forward")
	private String forward;

	@Argument(name = "payinfo")
	private String payInfo;

	@Argument(name = "lookhouse")
	private String lookHouse;

	@Argument(name = "room")
	private int room;

	@Argument(name = "toilet")
	private int toilet;

	@Argument(name = "hall")
	private int hall;

	@Argument(name = "kitchen")
	private int kitchen;

	@Argument(name = "balcony")
	private int balcony;

	@Argument(name = "floor")
	private int floor;

	@Argument(name = "fitment")
	private String fitment;

	@Argument(name = "buildingtype")
	private String buildingType;

	@Argument(name = "housestructure")
	private String houseStructure;

	@Argument(name = "propertysubtype")
	private String propertySubType;

	private List<ImgInfo> snImgs;

	@Argument(name = "image1")
	private String snImgStr;

	private List<ImgInfo> xqImgs;

	@Argument(name = "image2")
	private String xqImgStr;

	private List<ImgInfo> hxImgs;

	@Argument(name = "image3")
	private String hxImgStr;

	private List<ImgInfo> njImgs;

	@Argument(name = "image6")
	private String njImgStr;

	private List<ImgInfo> wjImgs;

	@Argument(name = "image7")
	private String wjImgStr;

	public SaleHouseInputRequest() {
		super(OpenApiConstants.HOUSE_TYPE_SALE, OpenApiConstants.PURPOSE_TYPE_HOUSE);
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Double getLiveArea() {
		return liveArea;
	}

	public void setLiveArea(Double liveArea) {
		this.liveArea = liveArea;
	}

	public List<String> getBaseService() {
		return baseService;
	}

	public void setBaseService(List<String> baseService) {
		this.baseService = baseService;
		this.baseServiceStr = super.convertToStrWithCommaFromStrings(baseService);
	}

	// public String getBaseServiceStr() {
	// return baseServiceStr;
	// }

	// public void setBaseServiceStr(String baseServiceStr) {
	// this.baseServiceStr = baseServiceStr;
	// }

	public List<String> getHouseTags() {
		return houseTags;
	}

	public void setHouseTags(List<String> houseTags) {
		this.houseTags = houseTags;
		this.houseTagsStr = super.convertToStrWithCommaFromStrings(houseTags);
	}

	// public String getHouseTagsStr() {
	// return houseTagsStr;
	// }

	// public void setHouseTagsStr(String houseTagsStr) {
	// this.houseTagsStr = houseTagsStr;
	// }

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public String getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	public String getLookHouse() {
		return lookHouse;
	}

	public void setLookHouse(String lookHouse) {
		this.lookHouse = lookHouse;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getToilet() {
		return toilet;
	}

	public void setToilet(int toilet) {
		this.toilet = toilet;
	}

	public int getHall() {
		return hall;
	}

	public void setHall(int hall) {
		this.hall = hall;
	}

	public int getKitchen() {
		return kitchen;
	}

	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}

	public int getBalcony() {
		return balcony;
	}

	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getFitment() {
		return fitment;
	}

	public void setFitment(String fitment) {
		this.fitment = fitment;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public String getHouseStructure() {
		return houseStructure;
	}

	public void setHouseStructure(String houseStructure) {
		this.houseStructure = houseStructure;
	}

	public String getPropertySubType() {
		return propertySubType;
	}

	public void setPropertySubType(String propertySubType) {
		this.propertySubType = propertySubType;
	}

	public List<ImgInfo> getSnImgs() {
		return this.snImgs;
	}

	public void setSnImgs(List<ImgInfo> snImgs) {
		this.snImgs = snImgs;
		this.snImgStr = super.convertToImgArg(snImgs);
	}

	public List<ImgInfo> getXqImgs() {
		return this.xqImgs;
	}

	public void setXqImgs(List<ImgInfo> xqImgs) {
		this.xqImgs = xqImgs;
		this.xqImgStr = super.convertToImgArg(xqImgs);
	}

	public List<ImgInfo> getHxImgs() {
		return this.hxImgs;
	}

	public void setHxImgs(List<ImgInfo> hxImgs) {
		this.hxImgs = hxImgs;
		this.hxImgStr = super.convertToImgArg(hxImgs);
	}

	public List<ImgInfo> getNjImgs() {
		return this.njImgs;
	}

	public void setNjImgs(List<ImgInfo> njImgs) {
		this.njImgs = njImgs;
		this.njImgStr = super.convertToImgArg(njImgs);
	}

	public List<ImgInfo> getWjImgs() {
		return this.wjImgs;
	}

	public void setWjImgs(List<ImgInfo> wjImgs) {
		this.wjImgs = wjImgs;
		this.wjImgStr = super.convertToImgArg(wjImgs);
	}

	@Override
	protected boolean validateBean() {
		if (!super.validateBean())
			return false;

		if (this.floor > getAllFloor()) {
			return false;
		}

		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		String baseMsg = super.beanInvalidMessage();
		if (baseMsg != null)
			return baseMsg;

		if (this.floor > getAllFloor()) {
			return "当前层数大于总层数";
		}

		return null;
	}
}
