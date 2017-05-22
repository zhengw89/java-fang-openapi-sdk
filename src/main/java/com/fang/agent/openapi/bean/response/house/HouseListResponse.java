package com.fang.agent.openapi.bean.response.house;

import java.util.Date;
import java.util.List;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class HouseListResponse extends BaseResponseBean<HouseListResponse.HouseList> {

	public class HouseList {
		@SerializedName("priorityexhibit")
		private int priorityExhibit;
		@SerializedName("releasecount")
		private int releaseCount;
		@SerializedName("unreleasecount")
		private int unreleaseCount;
		@SerializedName("overduecount")
		private int overdueCount;
		@SerializedName("violationcount")
		private int violationCount;
		@SerializedName("housecount")
		private int houseCount;
		@SerializedName("list")
		private List<HouseListItem> data;

		public int getPriorityExhibit() {
			return priorityExhibit;
		}

		public void setPriorityExhibit(int priorityExhibit) {
			this.priorityExhibit = priorityExhibit;
		}

		public int getReleaseCount() {
			return releaseCount;
		}

		public void setReleaseCount(int releaseCount) {
			this.releaseCount = releaseCount;
		}

		public int getUnreleaseCount() {
			return unreleaseCount;
		}

		public void setUnreleaseCount(int unreleaseCount) {
			this.unreleaseCount = unreleaseCount;
		}

		public int getOverdueCount() {
			return overdueCount;
		}

		public void setOverdueCount(int overdueCount) {
			this.overdueCount = overdueCount;
		}

		public int getViolationCount() {
			return violationCount;
		}

		public void setViolationCount(int violationCount) {
			this.violationCount = violationCount;
		}

		public int getHouseCount() {
			return houseCount;
		}

		public void setHouseCount(int houseCount) {
			this.houseCount = houseCount;
		}

		public List<HouseListItem> getData() {
			return data;
		}

		public void setData(List<HouseListItem> data) {
			this.data = data;
		}
	}

	public class HouseListItem {
		@SerializedName("houseid")
		private int houseId;
		@SerializedName("agentid")
		private int agentId;
		@SerializedName("agentname")
		private String agentName;
		@SerializedName("registdate")
		private Date registDate;
		@SerializedName("innerid")
		private String innerId;
		@SerializedName("isimage")
		private String isImage;
		@SerializedName("imagecount")
		private int imageCount;
		@SerializedName("isvideo")
		private String isVideo;
		@SerializedName("address")
		private String address;
		@SerializedName("room")
		private int room;
		@SerializedName("hall")
		private int hall;
		@SerializedName("toilet")
		private int toilet;
		@SerializedName("buildingarea")
		private double buildingArea;
		@SerializedName("price")
		private double price;
		@SerializedName("pricetype")
		private String priceType;
		@SerializedName("showlevel")
		private int showLevel;
		@SerializedName("messageinfo")
		private int messageInfo;
		@SerializedName("isbest")
		private int isBest;
		@SerializedName("exhibitsort")
		private int exhibitsort;
		@SerializedName("status")
		private int status;
		@SerializedName("Source")
		private String source;
		@SerializedName("projname")
		private String projName;
		@SerializedName("projcode")
		private long projCode;
		@SerializedName("isorder")
		private int isOrder;
		@SerializedName("limitdate")
		private int limitDate;
		@SerializedName("tag")
		private int tag;
		@SerializedName("tagaddtime")
		private Date tagAddTime;
		@SerializedName("inserttime")
		private Date insertTime;
		@SerializedName("isvalid")
		private String isValid;
		@SerializedName("abnormal")
		private int abnormal;
		@SerializedName("Purpose")
		private String purpose;
		@SerializedName("isRealHouse")
		private int isRealHouse;
		@SerializedName("isNewHouse")
		private int isNewHouse;
		@SerializedName("deposit")
		private int deposit;
		@SerializedName("Deposit_IsLock")
		private boolean depositIsLock;
		@SerializedName("boardtitle")
		private String boardTitle;
		
		public int getHouseId() {
			return houseId;
		}
		public void setHouseId(int houseId) {
			this.houseId = houseId;
		}
		public int getAgentId() {
			return agentId;
		}
		public void setAgentId(int agentId) {
			this.agentId = agentId;
		}
		public String getAgentName() {
			return agentName;
		}
		public void setAgentName(String agentName) {
			this.agentName = agentName;
		}
		public Date getRegistDate() {
			return registDate;
		}
		public void setRegistDate(Date registDate) {
			this.registDate = registDate;
		}
		public String getInnerId() {
			return innerId;
		}
		public void setInnerId(String innerId) {
			this.innerId = innerId;
		}
		public String getIsImage() {
			return isImage;
		}
		public void setIsImage(String isImage) {
			this.isImage = isImage;
		}
		public int getImageCount() {
			return imageCount;
		}
		public void setImageCount(int imageCount) {
			this.imageCount = imageCount;
		}
		public String getIsVideo() {
			return isVideo;
		}
		public void setIsVideo(String isVideo) {
			this.isVideo = isVideo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getRoom() {
			return room;
		}
		public void setRoom(int room) {
			this.room = room;
		}
		public int getHall() {
			return hall;
		}
		public void setHall(int hall) {
			this.hall = hall;
		}
		public int getToilet() {
			return toilet;
		}
		public void setToilet(int toilet) {
			this.toilet = toilet;
		}
		public double getBuildingArea() {
			return buildingArea;
		}
		public void setBuildingArea(double buildingArea) {
			this.buildingArea = buildingArea;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getPriceType() {
			return priceType;
		}
		public void setPriceType(String priceType) {
			this.priceType = priceType;
		}
		public int getShowLevel() {
			return showLevel;
		}
		public void setShowLevel(int showLevel) {
			this.showLevel = showLevel;
		}
		public int getMessageInfo() {
			return messageInfo;
		}
		public void setMessageInfo(int messageInfo) {
			this.messageInfo = messageInfo;
		}
		public int getIsBest() {
			return isBest;
		}
		public void setIsBest(int isBest) {
			this.isBest = isBest;
		}
		public int getExhibitsort() {
			return exhibitsort;
		}
		public void setExhibitsort(int exhibitsort) {
			this.exhibitsort = exhibitsort;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getProjName() {
			return projName;
		}
		public void setProjName(String projName) {
			this.projName = projName;
		}
		public long getProjCode() {
			return projCode;
		}
		public void setProjCode(long projCode) {
			this.projCode = projCode;
		}
		public int getIsOrder() {
			return isOrder;
		}
		public void setIsOrder(int isOrder) {
			this.isOrder = isOrder;
		}
		public int getLimitDate() {
			return limitDate;
		}
		public void setLimitDate(int limitDate) {
			this.limitDate = limitDate;
		}
		public int getTag() {
			return tag;
		}
		public void setTag(int tag) {
			this.tag = tag;
		}
		public Date getTagAddTime() {
			return tagAddTime;
		}
		public void setTagAddTime(Date tagAddTime) {
			this.tagAddTime = tagAddTime;
		}
		public Date getInsertTime() {
			return insertTime;
		}
		public void setInsertTime(Date insertTime) {
			this.insertTime = insertTime;
		}
		public String getIsValid() {
			return isValid;
		}
		public void setIsValid(String isValid) {
			this.isValid = isValid;
		}
		public int getAbnormal() {
			return abnormal;
		}
		public void setAbnormal(int abnormal) {
			this.abnormal = abnormal;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		public int getIsRealHouse() {
			return isRealHouse;
		}
		public void setIsRealHouse(int isRealHouse) {
			this.isRealHouse = isRealHouse;
		}
		public int getIsNewHouse() {
			return isNewHouse;
		}
		public void setIsNewHouse(int isNewHouse) {
			this.isNewHouse = isNewHouse;
		}
		public int getDeposit() {
			return deposit;
		}
		public void setDeposit(int deposit) {
			this.deposit = deposit;
		}
		public boolean isDepositIsLock() {
			return depositIsLock;
		}
		public void setDepositIsLock(boolean depositIsLock) {
			this.depositIsLock = depositIsLock;
		}
		public String getBoardTitle() {
			return boardTitle;
		}
		public void setBoardTitle(String boardTitle) {
			this.boardTitle = boardTitle;
		}


	}

}
