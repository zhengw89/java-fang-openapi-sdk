package com.fang.agent.openapi.bean.request.house;

import java.util.List;

public class SaleHouseInputRequestBuilder extends BaseInputRequestBuilder<SaleHouseInputRequest, SaleHouseInputRequestBuilder> {

	private final SaleHouseInputRequest request;

	public SaleHouseInputRequestBuilder() {

		this.request = new SaleHouseInputRequest();

		super.setBuilder(this);
		super.setRequest(request);
	}

	public SaleHouseInputRequestBuilder withCreateTime(int createTime) {
		request.setCreateTime(createTime);
		return this;
	}

	public SaleHouseInputRequestBuilder withLiveArea(double liveArea) {
		request.setLiveArea(liveArea);
		return this;
	}

	public SaleHouseInputRequestBuilder withBaseService(List<String> baseService) {
		request.setBaseService(baseService);
		return this;
	}

	public SaleHouseInputRequestBuilder withHouseTags(List<String> houseTags) {
		request.setHouseTags(houseTags);
		return this;
	}

	public SaleHouseInputRequestBuilder withForward(String forward) {
		request.setForward(forward);
		return this;
	}

	public SaleHouseInputRequestBuilder withPayInfo(String payInfo) {
		request.setPayInfo(payInfo);
		return this;
	}

	public SaleHouseInputRequestBuilder withLookHouse(String lookHouse) {
		request.setLookHouse(lookHouse);
		return this;
	}

	public SaleHouseInputRequestBuilder withRoom(int room) {
		request.setRoom(room);
		return this;
	}

	public SaleHouseInputRequestBuilder withToilet(int toilet) {
		request.setToilet(toilet);
		return this;
	}

	public SaleHouseInputRequestBuilder withHall(int hall) {
		request.setHall(hall);
		return this;
	}

	public SaleHouseInputRequestBuilder withKitchen(int kitchen) {
		request.setKitchen(kitchen);
		return this;
	}

	public SaleHouseInputRequestBuilder withBalcony(int balcony) {
		request.setBalcony(balcony);
		return this;
	}

	public SaleHouseInputRequestBuilder withFloor(int floor) {
		request.setFloor(floor);
		return this;
	}

	public SaleHouseInputRequestBuilder withFitment(String fitment) {
		request.setFitment(fitment);
		return this;
	}

	public SaleHouseInputRequestBuilder withBuildingType(String buildingType) {
		request.setBuildingType(buildingType);
		return this;
	}

	public SaleHouseInputRequestBuilder withHouseStructure(String houseStructure) {
		request.setHouseStructure(houseStructure);
		return this;
	}

	public SaleHouseInputRequestBuilder withPropertySubType(String propertySubType) {
		request.setPropertySubType(propertySubType);
		return this;
	}

	public SaleHouseInputRequestBuilder withSnImgs(List<ImgInfo> snImgs) {
		request.setSnImgs(snImgs);
		return this;
	}

	public SaleHouseInputRequestBuilder withXqImgs(List<ImgInfo> xqImgs) {
		request.setXqImgs(xqImgs);
		return this;
	}

	public SaleHouseInputRequestBuilder withNjImgs(List<ImgInfo> njImgs) {
		request.setNjImgs(njImgs);
		return this;
	}

	public SaleHouseInputRequestBuilder withWjImgs(List<ImgInfo> wjImgs) {
		request.setWjImgs(wjImgs);
		return this;
	}

}
