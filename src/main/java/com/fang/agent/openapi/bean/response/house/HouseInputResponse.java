package com.fang.agent.openapi.bean.response.house;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class HouseInputResponse extends BaseResponseBean<HouseInputResponse.HouseInputResultData> {

	public class HouseInputResultData {

		@SerializedName("innerid")
		private String innerId;

		@SerializedName("houseurl")
		private String houseUrl;

		@SerializedName("houseid")
		private int houseId;

		@SerializedName("flag")
		private int flag;

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

		public int getFlag() {
			return flag;
		}

		public void setFlag(int flag) {
			this.flag = flag;
		}
	}
}
