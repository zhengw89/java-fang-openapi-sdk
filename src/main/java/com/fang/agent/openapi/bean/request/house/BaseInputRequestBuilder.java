package com.fang.agent.openapi.bean.request.house;

public class BaseInputRequestBuilder<T extends BaseInputRequest, B extends BaseInputRequestBuilder<T, B>> {

	private T request;
	private B builder;

	protected void setRequest(T request) {
		this.request = request;
	}

	protected void setBuilder(B builder) {
		this.builder = builder;
	}

	public B withHouseType(String houseType) {
		this.request.setHouseType(houseType);
		return builder;
	}

	public B withPurposeType(String purposeType) {
		this.request.setPurposeType(purposeType);
		return builder;
	}

	public B withProjName(String projName) {
		this.request.setProjName(projName);
		return builder;
	}

	public B withDistrict(String district) {
		this.request.setDistrict(district);
		return builder;
	}

	public B withComarea(String comarea) {
		this.request.setComarea(comarea);
		return builder;
	}

	public B withAddress(String address) {
		this.request.setAddress(address);
		return builder;
	}

	public B withPrice(double price) {
		this.request.setPrice(price);
		return builder;
	}

	public B withBuildingArea(double buildingArea) {
		this.request.setBuildingArea(buildingArea);
		return builder;
	}

	public B withAllFloor(int allFloor) {
		this.request.setAllFloor(allFloor);
		return builder;
	}

	public B withInnerId(String innerId) {
		this.request.setInnerid(innerId);
		return builder;
	}

	public B withTrafficInfo(String trafficInfo) {
		this.request.setTrafficInfo(trafficInfo);
		return builder;
	}

	public B withSubwayInfo(String subwayInfo) {
		this.request.setSubwayInfo(subwayInfo);
		return builder;
	}

	public B withTitle(String title) {
		this.request.setTitle(title);
		return builder;
	}

	public B withContent(String content) {
		this.request.setContent(content);
		return builder;
	}

	public B withInfoCode(String infoCode) {
		this.request.setInfoCode(infoCode);
		return builder;
	}

	public B setFlag(String flag) {
		this.request.setFlag(flag);
		return builder;
	}

	public B setTitleImgUrl(String titleImgUrl) {
		this.request.setTitleImgUrl(titleImgUrl);
		return builder;
	}

	public T build() {
		return this.request;
	}
}
