package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;

public class SaleVillaInputRequest extends BaseInputRequest {

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

	@Argument(name = "workshoparea")
	private Double workshopArea;

	@Argument(name = "shoptype")
	private String ShopType;

	@Argument(name = "spacearea")
	private Double spaceArea;

	@Argument(name = "garage")
	private Integer grage;

	@Argument(name = "parkingplace")
	private Integer parkingPlace;

	@Argument(name = "fitment")
	private String fitment;

	@Argument(name = "buildingtype")
	private String buildingType;

	@Argument(name = "housestructure")
	private String houseStructure;

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

	public SaleVillaInputRequest() {
		super(OpenApiConstants.HOUSE_TYPE_SALE, OpenApiConstants.PURPOSE_TYPE_VILLA);
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

	public List<String> getHouseTags() {
		return houseTags;
	}

	public void setHouseTags(List<String> houseTags) {
		this.houseTags = houseTags;
		this.houseTagsStr = super.convertToStrWithCommaFromStrings(houseTags);
	}

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
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

	public Double getWorkshopArea() {
		return workshopArea;
	}

	public void setWorkshopArea(Double workshopArea) {
		this.workshopArea = workshopArea;
	}

	public String getShopType() {
		return ShopType;
	}

	public void setShopType(String shopType) {
		ShopType = shopType;
	}

	public Double getSpaceArea() {
		return spaceArea;
	}

	public void setSpaceArea(Double spaceArea) {
		this.spaceArea = spaceArea;
	}

	public Integer getGrage() {
		return grage;
	}

	public void setGrage(Integer grage) {
		this.grage = grage;
	}

	public Integer getParkingPlace() {
		return parkingPlace;
	}

	public void setParkingPlace(Integer parkingPlace) {
		this.parkingPlace = parkingPlace;
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

	public List<ImgInfo> getSnImgs() {
		return snImgs;
	}

	public void setShImgs(List<ImgInfo> snImgs) {
		this.snImgs = snImgs;
		this.snImgStr = super.convertToImgArg(snImgs);
	}

	public List<ImgInfo> getXqImgs() {
		return xqImgs;
	}

	public void setXqImgs(List<ImgInfo> xqImgs) {
		this.xqImgs = xqImgs;
		this.xqImgStr = super.convertToImgArg(xqImgs);
	}

	public List<ImgInfo> getHxImgs() {
		return hxImgs;
	}

	public void setHxImgs(List<ImgInfo> hxImgs) {
		this.hxImgs = hxImgs;
		this.hxImgStr = super.convertToImgArg(hxImgs);
	}

	public List<ImgInfo> getNjImgs() {
		return njImgs;
	}

	public void setNjImgs(List<ImgInfo> njImgs) {
		this.njImgs = njImgs;
		this.njImgStr = super.convertToImgArg(njImgs);
	}

	public List<ImgInfo> getWjImgs() {
		return wjImgs;
	}

	public void setWjImgs(List<ImgInfo> wjImgs) {
		this.wjImgs = wjImgs;
		this.wjImgStr = super.convertToImgArg(wjImgs);
	}

	@Override
	protected boolean validateBean() {
		if (!super.validateBean())
			return false;

		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		String baseMsg = super.beanInvalidMessage();
		if (baseMsg != null)
			return baseMsg;

		return null;
	}
}
