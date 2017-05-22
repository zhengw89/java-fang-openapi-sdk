package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;
import com.fang.agent.openapi.util.StringUtil;

public class LeaseShopUpdateRequest extends BaseUpdateRequest {

	@Argument(name = "pricetype")
	private String priceType;

	private List<String> baseService;

	@Argument(name = "baseservice")
	private String baseServiceStr;

	@Argument(name = "subtype")
	private String subType;

	private Boolean includFee;

	@Argument(name = "isincludfee")
	private int includFeeValue;

	@Argument(name = "propfee")
	private double propFee;

	private Boolean isDivisi;

	@Argument(name = "isdivisi")
	private String isDivisiStr;

	@Argument(name = "floor")
	private int floor;

	@Argument(name = "aimoperastion")
	private String aimOperastion;

	@Argument(name = "fitment")
	private String fitment;

	@Argument(name = "istransfer")
	private Integer isTransfer;

	@Argument(name = "transferfee")
	private String transferFee;

	@Argument(name = "shopstatus")
	private String shopStatus;

	private List<ImgInfo> njImgs;

	@Argument(name = "image6")
	private String njImgStr;

	private List<ImgInfo> wjImgs;

	@Argument(name = "image7")
	private String wjImgStr;

	protected LeaseShopUpdateRequest(String houseType, String purposeType) {
		super(OpenApiConstants.HOUSE_TYPE_LEASE, OpenApiConstants.PURPOSE_TYPE_SHOP);
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public List<String> getBaseService() {
		return baseService;
	}

	public void setBaseService(List<String> baseService) {
		this.baseService = baseService;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public Boolean getIncludFee() {
		return includFee;
	}

	public void setIncludFee(Boolean includFee) {
		this.includFee = includFee;
		this.includFeeValue = includFee == null || includFee == false ? 0 : 1;
	}

	public double getPropFee() {
		return propFee;
	}

	public void setPropFee(double propFee) {
		this.propFee = propFee;
	}

	public Boolean getIsDivisi() {
		return isDivisi;
	}

	public void setIsDivisi(Boolean isDivisi) {
		this.isDivisi = isDivisi;
		if (isDivisi == null) {
			this.isDivisiStr = null;
		} else {
			this.isDivisiStr = isDivisi ? "1" : "0";
		}
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getAimOperastion() {
		return aimOperastion;
	}

	public void setAimOperastion(String aimOperastion) {
		this.aimOperastion = aimOperastion;
	}

	public String getFitment() {
		return fitment;
	}

	public void setFitment(String fitment) {
		this.fitment = fitment;
	}

	public Integer getIsTransfer() {
		return isTransfer;
	}

	public void setIsTransfer(Integer isTransfer) {
		this.isTransfer = isTransfer;
	}

	public String getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(String transferFee) {
		this.transferFee = transferFee;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public List<ImgInfo> getNjImgs() {
		return njImgs;
	}

	public void setNjImgs(List<ImgInfo> njImgs) {
		this.njImgs = njImgs;
	}

	public List<ImgInfo> getWjImgs() {
		return wjImgs;
	}

	public void setWjImgs(List<ImgInfo> wjImgs) {
		this.wjImgs = wjImgs;
	}

	@Override
	protected boolean validateBean() {
		if (!super.validateBean()) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.priceType)) {
			return false;
		}
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		String msg = super.beanInvalidMessage();
		if (msg != null)
			return msg;
		if (StringUtil.isNullOrEmpty(this.priceType)) {
			return super.argNullErrorMessage("价格类型");
		}
		return null;
	}

}
