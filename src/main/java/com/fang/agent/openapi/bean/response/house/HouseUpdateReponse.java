package com.fang.agent.openapi.bean.response.house;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class HouseUpdateReponse extends BaseResponseBean<HouseUpdateReponse.HouseUpdateResultData> {

	public class HouseUpdateResultData {

		@SerializedName("innerid")
		private String innerId;

		@SerializedName("houseurl")
		private String houseUrl;

		@SerializedName("houseid")
		private int houseId;

		@SerializedName("status")
		private int status;

		public String getInnerId() {
			return innerId;
		}

		public void setInnerId(String innerId) {
			this.innerId = innerId;
		}

		public String getHouseUrl() {
			return houseUrl;
		}

		public void setHouseUrl(String houseUrl) {
			this.houseUrl = houseUrl;
		}

		public int getHouseId() {
			return houseId;
		}

		public void setHouseId(int houseId) {
			this.houseId = houseId;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

	}
}
