package com.fang.agent.openapi.bean.response.agent;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class AgentDetailResponse extends BaseResponseBean<AgentDetailResponse.AgentDetail> {

	public class AgentDetail {

		@SerializedName("username")
		private String userName;

		@SerializedName("name")
		private String name;

		@SerializedName("tel")
		private String tel;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

	}
}
