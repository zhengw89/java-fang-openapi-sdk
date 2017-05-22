package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;
import com.fang.agent.openapi.util.StringUtil;

public class LeaseHouseInputRequest extends BaseInputRequest {

	@Argument(name = "createtime")
	private Integer createTime;

	@Argument(name = "livearea")
	private Double liveArea;

	private List<String> baseService;

	@Argument(name = "baseservice")
	private String baseServiceStr;

	@Argument(name = "forward")
	private String forward;

	@Argument(name = "leasestyle")
	private String leaseStyle;

	@Argument(name = "leaseroomtype")
	private String leaseRoomType;

	@Argument(name = "leasedetail")
	private String leaseDetail;

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

	@Argument(name = "livetime")
	private String liveTime;

	@Argument(name = "equitment")
	private String equitment;

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

	protected LeaseHouseInputRequest() {
		super(OpenApiConstants.HOUSE_TYPE_LEASE, OpenApiConstants.PURPOSE_TYPE_HOUSE);
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

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public String getLeaseStyle() {
		return leaseStyle;
	}

	public void setLeaseStyle(String leaseStyle) {
		this.leaseStyle = leaseStyle;
	}

	public String getLeaseRoomType() {
		return leaseRoomType;
	}

	public void setLeaseRoomType(String leaseRoomType) {
		this.leaseRoomType = leaseRoomType;
	}

	public String getLeaseDetail() {
		return leaseDetail;
	}

	public void setLeaseDetail(String leaseDetail) {
		this.leaseDetail = leaseDetail;
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

	public String getLiveTime() {
		return liveTime;
	}

	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}

	public String getEquitment() {
		return equitment;
	}

	public void setEquitment(String equitment) {
		this.equitment = equitment;
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

	public void setSnImgs(List<ImgInfo> snImgs) {
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
		if (StringUtil.isNullOrEmpty(this.leaseStyle))
			return false;

		return super.validateBean();
	}

	@Override
	protected String beanInvalidMessage() {
		if (StringUtil.isNullOrEmpty(this.leaseStyle))
			return super.argNullErrorMessage("×âÁÞ·½Ê½");

		return super.beanInvalidMessage();
	}

}
