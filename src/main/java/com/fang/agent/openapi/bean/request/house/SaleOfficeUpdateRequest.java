package com.fang.agent.openapi.bean.request.house;

import java.util.List;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;

public class SaleOfficeUpdateRequest extends BaseUpdateRequest {

	@Argument(name = "propertygrade")
	private String propertyGrade;

	@Argument(name = "subtype")
	private String subType;

	@Argument(name = "propfee")
	private double propFee;

	private Boolean isDivisi;

	@Argument(name = "isdivisi")
	private String isDivisiStr;

	@Argument(name = "floor")
	private int floor;

	@Argument(name = "fitment")
	private String fitment;

	private List<ImgInfo> jtImgs;

	@Argument(name = "image4")
	private String jtImgStr;

	private List<ImgInfo> pmImgs;

	@Argument(name = "image5")
	private String pmImgStr;

	private List<ImgInfo> njImgs;

	@Argument(name = "image6")
	private String njImgStr;

	private List<ImgInfo> wjImgs;

	@Argument(name = "image7")
	private String wjImgStr;

	protected SaleOfficeUpdateRequest() {
		super(OpenApiConstants.HOUSE_TYPE_SALE, OpenApiConstants.PURPOSE_TYPE_OFFICE);
	}

	public String getPropertyGrade() {
		return propertyGrade;
	}

	public void setPropertyGrade(String propertyGrade) {
		this.propertyGrade = propertyGrade;
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

	// public String getIsDivisiStr() {
	// return isDivisiStr;
	// }
	//
	// public void setIsDivisiStr(String isDivisiStr) {
	// this.isDivisiStr = isDivisiStr;
	// }

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

	public List<ImgInfo> getJtImgs() {
		return jtImgs;
	}

	public void setJtImgs(List<ImgInfo> jtImgs) {
		this.jtImgs = jtImgs;
		this.jtImgStr = super.convertToImgArg(jtImgs);
	}

	public List<ImgInfo> getPmImgs() {
		return pmImgs;
	}

	public void setPmImgs(List<ImgInfo> pmImgs) {
		this.pmImgs = pmImgs;
		this.pmImgStr = super.convertToImgArg(pmImgs);
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

}