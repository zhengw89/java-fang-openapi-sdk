package com.fang.agent.openapi.bean.response.house;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class HousePhotoAddReponse extends BaseResponseBean<HousePhotoAddReponse.HousePhotoAddData> {

	public class HousePhotoAddData {

		@SerializedName("photoid")
		private int photoId;

		public int getPhotoId() {
			return photoId;
		}

		public void setPhotoId(int photoId) {
			this.photoId = photoId;
		}

	}
}
