package com.fang.agent.openapi.bean.response.agent;

import com.fang.agent.openapi.bean.response.BaseResponseBean;
import com.google.gson.annotations.SerializedName;

public class AgentPortInfoResponse extends BaseResponseBean<AgentPortInfoResponse.AgentPortInfo> {

	public class AgentPortInfo {
		@SerializedName(value = "todayused")
		private int todayUsed;
		@SerializedName(value = "todayremain")
		private int todayRemain;
		@SerializedName(value = "tagnewused")
		private int tagNewUsed;
		@SerializedName(value = "tagnewremain")
		private int tagNewRemain;
		@SerializedName(value = "tagurgentused")
		private int tagUrgentUsed;
		@SerializedName(value = "tagurgentremain")
		private int tagUrgentRemain;
		@SerializedName(value = "tagrealused")
		private int tagRealUsed;
		@SerializedName(value = "tagrealremain")
		private int tagRealRemain;
		@SerializedName(value = "reservationrefreshexcuted")
		private int reservationRefresheExcuted;
		@SerializedName(value = "reservationrefreshunexcute")
		private int reservationRefresheUnexcute;
		@SerializedName(value = "reservationsettingorder")
		private int reservationSettingOrder;
		@SerializedName(value = "reservationsettinghouse")
		private int reservationSettingHouse;
		@SerializedName(value = "abouttoexpire")
		private int aboutToExpire;
		@SerializedName(value = "expriepublished")
		private int expriePublished;
		@SerializedName(value = "expriepublishable")
		private int expriePublishable;
		@SerializedName(value = "housecount")
		private int houseCount;
		@SerializedName(value = "housemax")
		private int houseMax;
		@SerializedName(value = "houseremaincount")
		private int houseRemainCount;
		
		public void setTodayUsed(int todayUsed) {
			this.todayUsed = todayUsed;
		}
		
		public int getTodayUsed() {
			return this.todayUsed;
		}
		
		public void setTodayRemain(int todayRemain) {
			this.todayRemain = todayRemain;
		}
		
		public int getTodayRemain() {
			return this.todayRemain;
		}
		
		public void setTagNewUsed(int tagNewUsed) {
			this.tagNewUsed = tagNewUsed;
		}
		
		public int getTagNewUsed() {
			return this.tagNewUsed;
		}
		
		public void setTagNewRemain(int tagNewReamin) {
			this.tagNewRemain = tagNewReamin;
		}
		
		public int getTagNewReamin() {
			return this.tagNewRemain;
		}
		
		public void setTagUrgentUsed(int tagUrgentUsed) {
			this.tagUrgentUsed = tagUrgentUsed;
		}
		
		public int getTagUrgentUsed() {
			return this.tagUrgentUsed;
		}
		
		public void setTagUrgentRemain(int tagUrgentRemain) {
			this.tagUrgentRemain = tagUrgentRemain;
		}
		
		public int getTagUrgentRemain() {
			return this.tagUrgentRemain;
		}

		public int getTagRealUsed() {
			return tagRealUsed;
		}

		public void setTagRealUsed(int tagRealUsed) {
			this.tagRealUsed = tagRealUsed;
		}

		public int getTagRealRemain() {
			return tagRealRemain;
		}

		public void setTagRealRemain(int tagRealRemain) {
			this.tagRealRemain = tagRealRemain;
		}

		public int getReservationRefresheExcuted() {
			return reservationRefresheExcuted;
		}

		public void setReservationRefresheExcuted(int reservationRefresheExcuted) {
			this.reservationRefresheExcuted = reservationRefresheExcuted;
		}

		public int getReservationRefresheUnexcute() {
			return reservationRefresheUnexcute;
		}

		public void setReservationRefresheUnexcute(int reservationRefresheUnexcute) {
			this.reservationRefresheUnexcute = reservationRefresheUnexcute;
		}

		public int getReservationSettingOrder() {
			return reservationSettingOrder;
		}

		public void setReservationSettingOrder(int reservationSettingOrder) {
			this.reservationSettingOrder = reservationSettingOrder;
		}

		public int getReservationSettingHouse() {
			return reservationSettingHouse;
		}

		public void setReservationSettingHouse(int reservationSettingHouse) {
			this.reservationSettingHouse = reservationSettingHouse;
		}

		public int getAboutToExpire() {
			return aboutToExpire;
		}

		public void setAboutToExpire(int aboutToExpire) {
			this.aboutToExpire = aboutToExpire;
		}

		public int getExpriePublished() {
			return expriePublished;
		}

		public void setExpriePublished(int expriePublished) {
			this.expriePublished = expriePublished;
		}

		public int getExpriePublishable() {
			return expriePublishable;
		}

		public void setExpriePublishable(int expriePublishable) {
			this.expriePublishable = expriePublishable;
		}

		public int getHouseCount() {
			return houseCount;
		}

		public void setHouseCount(int houseCount) {
			this.houseCount = houseCount;
		}

		public int getHouseMax() {
			return houseMax;
		}

		public void setHouseMax(int houseMax) {
			this.houseMax = houseMax;
		}

		public int getHouseRemainCount() {
			return houseRemainCount;
		}

		public void setHouseRemainCount(int houseRemainCount) {
			this.houseRemainCount = houseRemainCount;
		}
	}
}
