package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;

public class SaleShopUpdateRequest extends BaseUpdateRequest {

	private List<String> baseService;

	@Argument(name = "baseservice")
	private String baseServiceStr;

	@Argument(name = "subtype")
	private String subType;

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

	private List<ImgInfo> njImgs;

	@Argument(name = "image6")
	private String njImgStr;

	private List<ImgInfo> wjImgs;

	@Argument(name = "image7")
	private String wjImgStr;

	protected SaleShopUpdateRequest() {
		super(OpenApiConstants.HOUSE_TYPE_SALE, OpenApiConstants.PURPOSE_TYPE_SHOP);
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
