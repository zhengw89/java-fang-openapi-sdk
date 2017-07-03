package com.fang.agent.openapi.bean.response.house;

import java.util.List;

import com.fang.agent.openapi.bean.response.BaseResponseBean;

public class RefreshSolutionListResponse extends BaseResponseBean<List<RefreshSolutionListResponse.RefreshSolutionListData>> {

	public class RefreshSolutionListData {

		private int id;

		private String projname;

		private List<RefreshTimeSet> timesets;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<RefreshTimeSet> getTimesets() {
			return timesets;
		}

		public void setTimesets(List<RefreshTimeSet> timesets) {
			this.timesets = timesets;
		}

		public String getProjname() {
			return projname;
		}

		public void setProjname(String projname) {
			this.projname = projname;
		}

	}

	public class RefreshTimeSet {

		private int hour;

		private List<Integer> minutes;

		public int getHour() {
			return hour;
		}

		public void setHour(int hour) {
			this.hour = hour;
		}

		public List<Integer> getMinutes() {
			return minutes;
		}

		public void setMinutes(List<Integer> minutes) {
			this.minutes = minutes;
		}

	}
}
