package com.fang.agent.openapi.bean.response.house;

import java.util.List;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class HousePhotosResponse extends BaseResponseBean<List<HousePhotosResponse.HousePhoto>> {

	public class HousePhoto {

		@SerializedName("HouseID")
		private int houseId;

		@SerializedName("PhotoID")
		private int photoId;

		@SerializedName("PHOTOURL")
		private String photoUrl;

		@SerializedName("PHOTONAME")
		private String photoName;

		@SerializedName("ALBUMID")
		private Integer albumId;

		@SerializedName("ALBUMNAME")
		private String albumName;

		public int getHouseId() {
			return houseId;
		}

		public void setHouseId(int houseId) {
			this.houseId = houseId;
		}

		public int getPhotoId() {
			return photoId;
		}

		public void setPhotoId(int photoId) {
			this.photoId = photoId;
		}

		public String getPhotoUrl() {
			return photoUrl;
		}

		public void setPhotoUrl(String photoUrl) {
			this.photoUrl = photoUrl;
		}

		public String getPhotoName() {
			return photoName;
		}

		public void setPhotoName(String photoName) {
			this.photoName = photoName;
		}

		public Integer getAlbumId() {
			return albumId;
		}

		public void setAlbumId(Integer albumId) {
			this.albumId = albumId;
		}

		public String getAlbumName() {
			return albumName;
		}

		public void setAlbumName(String albumName) {
			this.albumName = albumName;
		}

	}
}
