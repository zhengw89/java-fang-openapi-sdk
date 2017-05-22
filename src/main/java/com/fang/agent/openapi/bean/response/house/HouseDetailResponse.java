package com.fang.agent.openapi.bean.response.house;

import java.util.Date;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class HouseDetailResponse extends BaseResponseBean<HouseDetailResponse.HouseDetail> {

	public class HouseDetail {

		@SerializedName("PurposeType")
		private Integer purposeType;

		@SerializedName("HouseType")
		private Integer houseType;

		@SerializedName("boardcontent")
		private String boardContent;

		@SerializedName("subwayinfo")
		private String subwayInfo;

		@SerializedName("trafficinfo")
		private String trafficInfo;

		@SerializedName("registdate")
		private Date registDate;

		@SerializedName("city")
		private String city;

		@SerializedName("floor")
		private Integer floor;

		@SerializedName("totalfloor")
		private Integer totalFloor;

		@SerializedName("livearea")
		private Double liveArea;

		@SerializedName("forward")
		private String forward;

		@SerializedName("createtime")
		private String projCreateTime;

		@SerializedName("baseservice")
		private String baseService;

		@SerializedName("fitment")
		private String fitment;

		@SerializedName("lookhousetype")
		private String lookHouseType;

		@SerializedName("propertysubtype")
		private String propertySubType;

		@SerializedName("room")
		private Integer room;

		@SerializedName("hall")
		private Integer hall;

		@SerializedName("toilet")
		private Integer toilet;

		@SerializedName("kitchen")
		private Integer kitchen;

		@SerializedName("balcony")
		private Integer balcony;

		@SerializedName("payinfo")
		private String payInfo;

		@SerializedName("workshoparea")
		private Double workshopArea;

		@SerializedName("spacearea")
		private Double spaceArea;

		@SerializedName("garage")
		private Integer garage;

		@SerializedName("parkingplace")
		private Integer parkingPlace;

		@SerializedName("shoptype")
		private String shopType;

		@SerializedName("propertyfee")
		private Double propertyFee;

		@SerializedName("propertycompany")
		private String propertyCompany;

		@SerializedName("isdivisibility")
		private Integer isDivisibility;

		@SerializedName("aimoperastion")
		private String aimOperastion;

		@SerializedName("propertygrade")
		private String propertyrade;

		@SerializedName("floorarea")
		private Double floorArea;

		@SerializedName("officearea")
		private Double officeArea;

		@SerializedName("dormitory")
		private String dormitory;

		@SerializedName("span")
		private String span;

		@SerializedName("floorheight")
		private Double floorHeight;

		@SerializedName("loadbearing")
		private Double loadbearing;

		@SerializedName("water")
		private String water;

		@SerializedName("buildingtype")
		private String buildingType;

		@SerializedName("housestructure")
		private String houseStructure;

		@SerializedName("tagschool")
		private Integer tagSchool;

		@SerializedName("agentid")
		private Integer agentId;

		@SerializedName("agentname")
		private String agentName;

		@SerializedName("isorder")
		private Integer isOrder;

		@SerializedName("ispay")
		private Integer isPay;

		@SerializedName("exhibitsort")
		private Integer exhibitSort;

		@SerializedName("status")
		private Integer status;

		@SerializedName("isvalid")
		private Integer isValid;

		@SerializedName("houseid")
		private Integer houseId;

		@SerializedName("district")
		private String district;

		@SerializedName("comarea")
		private String comarea;

		@SerializedName("address")
		private String address;

		@SerializedName("purpose")
		private String purpose;

		@SerializedName("projcode")
		private Long projCode;

		@SerializedName("projname")
		private String projName;

		@SerializedName("buildingarea")
		private Double buildingArea;

		@SerializedName("price")
		private Double price;

		@SerializedName("pricetype")
		private String priceType;

		@SerializedName("boardtitle")
		private String boardTitle;

		@SerializedName("innerid")
		private String innerid;

		@SerializedName("photourl")
		private String photoUrl;

		@SerializedName("feature")
		private String feature;

		@SerializedName("infocode")
		private String infoCode;

		public Integer getPurposeType() {
			return purposeType;
		}

		public void setPurposeType(Integer purposeType) {
			this.purposeType = purposeType;
		}

		public Integer getHouseType() {
			return houseType;
		}

		public void setHouseType(Integer houseType) {
			this.houseType = houseType;
		}

		public String getBoardContent() {
			return boardContent;
		}

		public void setBoardContent(String boardContent) {
			this.boardContent = boardContent;
		}

		public String getSubwayInfo() {
			return subwayInfo;
		}

		public void setSubwayInfo(String subwayInfo) {
			this.subwayInfo = subwayInfo;
		}

		public String getTrafficInfo() {
			return trafficInfo;
		}

		public void setTrafficInfo(String trafficInfo) {
			this.trafficInfo = trafficInfo;
		}

		public Date getRegistDate() {
			return registDate;
		}

		public void setRegistDate(Date registDate) {
			this.registDate = registDate;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Integer getFloor() {
			return floor;
		}

		public void setFloor(Integer floor) {
			this.floor = floor;
		}

		public Integer getTotalFloor() {
			return totalFloor;
		}

		public void setTotalFloor(Integer totalFloor) {
			this.totalFloor = totalFloor;
		}

		public Double getLiveArea() {
			return liveArea;
		}

		public void setLiveArea(Double liveArea) {
			this.liveArea = liveArea;
		}

		public String getForward() {
			return forward;
		}

		public void setForward(String forward) {
			this.forward = forward;
		}

		public String getProjCreateTime() {
			return projCreateTime;
		}

		public void setProjCreateTime(String projCreateTime) {
			this.projCreateTime = projCreateTime;
		}

		public String getBaseService() {
			return baseService;
		}

		public void setBaseService(String baseService) {
			this.baseService = baseService;
		}

		public String getFitment() {
			return fitment;
		}

		public void setFitment(String fitment) {
			this.fitment = fitment;
		}

		public String getLookHouseType() {
			return lookHouseType;
		}

		public void setLookHouseType(String lookHouseType) {
			this.lookHouseType = lookHouseType;
		}

		public String getPropertySubType() {
			return propertySubType;
		}

		public void setPropertySubType(String propertySubType) {
			this.propertySubType = propertySubType;
		}

		public Integer getRoom() {
			return room;
		}

		public void setRoom(Integer room) {
			this.room = room;
		}

		public Integer getHall() {
			return hall;
		}

		public void setHall(Integer hall) {
			this.hall = hall;
		}

		public Integer getToilet() {
			return toilet;
		}

		public void setToilet(Integer toilet) {
			this.toilet = toilet;
		}

		public Integer getKitchen() {
			return kitchen;
		}

		public void setKitchen(Integer kitchen) {
			this.kitchen = kitchen;
		}

		public Integer getBalcony() {
			return balcony;
		}

		public void setBalcony(Integer balcony) {
			this.balcony = balcony;
		}

		public String getPayInfo() {
			return payInfo;
		}

		public void setPayInfo(String payInfo) {
			this.payInfo = payInfo;
		}

		public Double getWorkshopArea() {
			return workshopArea;
		}

		public void setWorkshopArea(Double workshopArea) {
			this.workshopArea = workshopArea;
		}

		public Double getSpaceArea() {
			return spaceArea;
		}

		public void setSpaceArea(Double spaceArea) {
			this.spaceArea = spaceArea;
		}

		public Integer getGarage() {
			return garage;
		}

		public void setGarage(Integer garage) {
			this.garage = garage;
		}

		public Integer getParkingPlace() {
			return parkingPlace;
		}

		public void setParkingPlace(Integer parkingPlace) {
			this.parkingPlace = parkingPlace;
		}

		public String getShopType() {
			return shopType;
		}

		public void setShopType(String shopType) {
			this.shopType = shopType;
		}

		public Double getPropertyFee() {
			return propertyFee;
		}

		public void setPropertyFee(Double propertyFee) {
			this.propertyFee = propertyFee;
		}

		public String getPropertyCompany() {
			return propertyCompany;
		}

		public void setPropertyCompany(String propertyCompany) {
			this.propertyCompany = propertyCompany;
		}

		public Integer getIsDivisibility() {
			return isDivisibility;
		}

		public void setIsDivisibility(Integer isDivisibility) {
			this.isDivisibility = isDivisibility;
		}

		public String getAimOperastion() {
			return aimOperastion;
		}

		public void setAimOperastion(String aimOperastion) {
			this.aimOperastion = aimOperastion;
		}

		public String getPropertyrade() {
			return propertyrade;
		}

		public void setPropertyrade(String propertyrade) {
			this.propertyrade = propertyrade;
		}

		public Double getFloorArea() {
			return floorArea;
		}

		public void setFloorArea(Double floorArea) {
			this.floorArea = floorArea;
		}

		public Double getOfficeArea() {
			return officeArea;
		}

		public void setOfficeArea(Double officeArea) {
			this.officeArea = officeArea;
		}

		public String getDormitory() {
			return dormitory;
		}

		public void setDormitory(String dormitory) {
			this.dormitory = dormitory;
		}

		public String getSpan() {
			return span;
		}

		public void setSpan(String span) {
			this.span = span;
		}

		public Double getFloorHeight() {
			return floorHeight;
		}

		public void setFloorHeight(Double floorHeight) {
			this.floorHeight = floorHeight;
		}

		public Double getLoadbearing() {
			return loadbearing;
		}

		public void setLoadbearing(Double loadbearing) {
			this.loadbearing = loadbearing;
		}

		public String getWater() {
			return water;
		}

		public void setWater(String water) {
			this.water = water;
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

		public Integer getTagSchool() {
			return tagSchool;
		}

		public void setTagSchool(Integer tagSchool) {
			this.tagSchool = tagSchool;
		}

		public Integer getAgentId() {
			return agentId;
		}

		public void setAgentId(Integer agentId) {
			this.agentId = agentId;
		}

		public String getAgentName() {
			return agentName;
		}

		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}

		public Integer getIsOrder() {
			return isOrder;
		}

		public void setIsOrder(Integer isOrder) {
			this.isOrder = isOrder;
		}

		public Integer getIsPay() {
			return isPay;
		}

		public void setIsPay(Integer isPay) {
			this.isPay = isPay;
		}

		public Integer getExhibitSort() {
			return exhibitSort;
		}

		public void setExhibitSort(Integer exhibitSort) {
			this.exhibitSort = exhibitSort;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getIsValid() {
			return isValid;
		}

		public void setIsValid(Integer isValid) {
			this.isValid = isValid;
		}

		public Integer getHouseId() {
			return houseId;
		}

		public void setHouseId(Integer houseId) {
			this.houseId = houseId;
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

		public String getPurpose() {
			return purpose;
		}

		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}

		public Long getProjCode() {
			return projCode;
		}

		public void setProjCode(Long projCode) {
			this.projCode = projCode;
		}

		public String getProjName() {
			return projName;
		}

		public void setProjName(String projName) {
			this.projName = projName;
		}

		public Double getBuildingArea() {
			return buildingArea;
		}

		public void setBuildingArea(Double buildingArea) {
			this.buildingArea = buildingArea;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getPriceType() {
			return priceType;
		}

		public void setPriceType(String priceType) {
			this.priceType = priceType;
		}

		public String getBoardTitle() {
			return boardTitle;
		}

		public void setBoardTitle(String boardTitle) {
			this.boardTitle = boardTitle;
		}

		public String getInnerid() {
			return innerid;
		}

		public void setInnerid(String innerid) {
			this.innerid = innerid;
		}

		public String getPhotoUrl() {
			return photoUrl;
		}

		public void setPhotoUrl(String photoUrl) {
			this.photoUrl = photoUrl;
		}

		public String getFeature() {
			return feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getInfoCode() {
			return infoCode;
		}

		public void setInfoCode(String infoCode) {
			this.infoCode = infoCode;
		}
	}
}
