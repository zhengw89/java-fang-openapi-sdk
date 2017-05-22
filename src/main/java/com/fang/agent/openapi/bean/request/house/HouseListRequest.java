package com.fang.agent.openapi.bean.request.house;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;

public class HouseListRequest extends BaseRequestBean {

	@Argument(name = "curpage")
	private int curPage;

	@Argument(name = "filter")
	private String filter;

	@Argument(name = "hall")
	private Integer hall;

	@Argument(name = "houseId")
	private Integer houseId;

	@Argument(name = "houseStatus")
	private int houseStaut;

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "innerId")
	private String innerId;

	@Argument(name = "order")
	private String order;

	@Argument(name = "pagesize")
	private int pageSize;

	@Argument(name = "priceMax")
	private Integer priceMax;

	@Argument(name = "priceMin")
	private Integer priceMin;

	@Argument(name = "projName")
	private String projName;

	@Argument(name = "purposeType")
	private String purposeType;

	@Argument(name = "room")
	private Integer room;

	public int getCurPage() {
		return curPage;
	}

	public String getFilter() {
		return filter;
	}

	public Integer getHall() {
		return hall;
	}

	public Integer getHouseId() {
		return houseId;
	}

	public int getHouseStaut() {
		return houseStaut;
	}

	public String getHouseType() {
		return houseType;
	}

	public String getInnerId() {
		return innerId;
	}

	public String getOrder() {
		return order;
	}

	public int getPageSize() {
		return pageSize;
	}

	public Integer getPriceMax() {
		return priceMax;
	}

	public Integer getPriceMin() {
		return priceMin;
	}

	public String getProjName() {
		return projName;
	}

	public String getPurposeType() {
		return purposeType;
	}

	public Integer getRoom() {
		return room;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public void setHall(Integer hall) {
		this.hall = hall;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public void setHouseStaut(int houseStaut) {
		this.houseStaut = houseStaut;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public void setInnerId(String innerId) {
		this.innerId = innerId;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPriceMax(Integer priceMax) {
		this.priceMax = priceMax;
	}

	public void setPriceMin(Integer priceMin) {
		this.priceMin = priceMin;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	@Override
	protected String beanInvalidMessage() {
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("房源类型", this.houseType);
		}
		if (!super.checkHouseStatusValueLegal(this.houseStaut)) {
			return super.argInvalidErrorMessage("房源状态", this.houseStaut);
		}

		return null;
	}

	@Override
	protected boolean validateBean() {
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (!super.checkHouseStatusValueLegal(this.houseStaut)) {
			return false;
		}

		return true;
	}

}
