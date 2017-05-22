package com.fang.agent.openapi.bean.request.house;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.util.StringUtil;

public class HousePhotoAddRequest extends BaseRequestBean {

	@Argument(name = "purposeType")
	private String purposeType;

	@Argument(name = "houseType")
	private String houseType;

	@Argument(name = "houseid")
	private int houseId;

	@Argument(name = "photoname")
	private String photoName;

	@Argument(name = "albumid")
	private int albumType;

	@Argument(name = "houseStatus")
	private int houseStatus;

	@Argument(name = "photourl")
	private String photoUrl;

	public String getPurposeType() {
		return purposeType;
	}

	public void setPurposeType(String purposeType) {
		this.purposeType = purposeType;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public int getAlbumType() {
		return albumType;
	}

	public void setAlbumType(int albumType) {
		this.albumType = albumType;
	}

	public int getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(int houseStatus) {
		this.houseStatus = houseStatus;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Override
	protected boolean validateBean() {
		if (StringUtil.isNullOrEmpty(this.purposeType)) {
			return false;
		}
		if (!super.checkPurposeTypeValueLegal(this.purposeType)) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return false;
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.photoName)) {
			return false;
		}
		if (!super.checkHousPhotoAlbumTypeValueLegal(this.albumType)) {
			return false;
		}
		if (!super.checkHouseStatusValueLegal(this.houseStatus)) {
			return false;
		}
		if (StringUtil.isNullOrEmpty(this.photoUrl)) {
			return false;
		}
		return true;
	}

	@Override
	protected String beanInvalidMessage() {
		if (StringUtil.isNullOrEmpty(this.purposeType)) {
			return super.argNullErrorMessage("��ҵ����");
		}
		if (!super.checkPurposeTypeValueLegal(this.purposeType)) {
			return super.argInvalidErrorMessage("��ҵ����", this.purposeType);
		}
		if (StringUtil.isNullOrEmpty(this.houseType)) {
			return super.argNullErrorMessage("��Դ����");
		}
		if (!super.checkHouseTypeValueLegal(this.houseType)) {
			return super.argInvalidErrorMessage("��Դ����", this.houseType);
		}
		if (StringUtil.isNullOrEmpty(this.photoName)) {
			return super.argNullErrorMessage("ͼƬ����");
		}
		if (!super.checkHousPhotoAlbumTypeValueLegal(this.albumType)) {
			return super.argInvalidErrorMessage("ͼƬ����", this.albumType);
		}
		if (!super.checkHouseStatusValueLegal(this.houseStatus)) {
			return super.argInvalidErrorMessage("��Դ״̬", this.houseStatus);
		}
		if (StringUtil.isNullOrEmpty(this.photoUrl)) {
			return super.argNullErrorMessage("ͼƬ��ַ");
		}
		return null;
	}

}
