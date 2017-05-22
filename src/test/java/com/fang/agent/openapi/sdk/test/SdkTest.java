package com.fang.agent.openapi.sdk.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.fang.agent.openapi.Sdk;
import com.fang.agent.openapi.bean.request.house.HouseDeleteRequest;
import com.fang.agent.openapi.bean.request.house.HouseDetailRequest;
import com.fang.agent.openapi.bean.request.house.HouseListRequest;
import com.fang.agent.openapi.bean.request.house.HousePhotosRequest;
import com.fang.agent.openapi.bean.request.house.SaleHouseInputRequest;
import com.fang.agent.openapi.bean.request.house.SaleHouseInputRequestBuilder;
import com.fang.agent.openapi.bean.response.agent.AgentDetailResponse;
import com.fang.agent.openapi.bean.response.house.HouseDeleteResponse;
import com.fang.agent.openapi.bean.response.house.HouseDetailResponse;
import com.fang.agent.openapi.bean.response.house.HouseInputResponse;
import com.fang.agent.openapi.bean.response.house.HouseListResponse;
import com.fang.agent.openapi.bean.response.house.HousePhotosResponse;
import com.fang.agent.openapi.constants.OpenApiConstants;

public class SdkTest {

	private static final String HOST = "h";
	private static final int COMPANY_ID = 1;
	private static final String API_KEY = "ak";
	private static final int AGENT_ID = 1;
	private static final String USERNAME = "un";
	private static final String PASSWORD = "pw";
	private static final Sdk SDK = new Sdk(HOST, String.valueOf(COMPANY_ID), API_KEY, true);

	@Test
	@Ignore
	public void AuthorizeTest() {
		try {
			String response = SDK.AgentAuthentication(USERNAME, PASSWORD);
			System.out.println(response);
			assertNotNull(response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void SaleHouseInputTest() {
		SaleHouseInputRequest request = new SaleHouseInputRequest();
		request.setBuildingArea(111.1);
		request.setContent("NNNNNNNNNNNNNNNN");
		request.setFlag("1");
		request.setFloor(1);
		request.setAllFloor(11);
		request.setHall(1);
		request.setKitchen(1);
		request.setLiveArea(111.1);
		request.setPrice(500);
		request.setProjName("裕隆新村");
		request.setRoom(1);
		request.setTitle("TTTTTTTT");
		request.setToilet(1);
		request.setPayInfo("个人产权");
		request.setBalcony(1);
		HouseInputResponse response = SDK.HouseInput(AGENT_ID, request);

		assertNotNull(response);
	}

	@Test
	@Ignore
	public void HouseDeleteTest() {
		HouseDeleteRequest request = new HouseDeleteRequest();
		request.setFlag(1);
		List<Integer> houseIds = new ArrayList<Integer>();
		houseIds.add(328321117);
		request.setHouseIds(houseIds);
		request.setHouseType(OpenApiConstants.HOUSE_TYPE_SALE);
		HouseDeleteResponse response = SDK.HouseDelete(AGENT_ID, request);

		assertNotNull(response);
	}

	@Test
	@Ignore
	public void HouseListTest() {
		HouseListRequest request = new HouseListRequest();
		request.setCurPage(1);
		request.setHouseStaut(OpenApiConstants.HOUSE_STATUS_PUBLISHED);
		request.setPageSize(10);
		request.setHouseType(OpenApiConstants.HOUSE_TYPE_SALE);
		HouseListResponse response = SDK.HouseList(AGENT_ID, request);

		assertNotNull(response);
	}

	@Test
	@Ignore
	public void HouseDetailTest() {
		HouseDetailRequest request = new HouseDetailRequest();
		request.setHouseId(342022123);
		request.setHouseStatus(OpenApiConstants.HOUSE_STATUS_PUBLISHED);
		request.setHouseType(OpenApiConstants.HOUSE_TYPE_SALE);
		HouseDetailResponse response = SDK.HouseDetail(AGENT_ID, request);

		assertNotNull(response);
	}

	@Test
	@Ignore
	public void HousePhotosTest() {
		HousePhotosRequest request = new HousePhotosRequest();
		request.setHouseId(342022123);
		request.setHouseType(OpenApiConstants.HOUSE_TYPE_SALE);
		HousePhotosResponse response = SDK.HousePhotos(AGENT_ID, request);

		assertNotNull(response);
	}

	@Test
	@Ignore
	public void UploadFileTest() {
		try {
			String result = SDK.UploadImg(AGENT_ID, "C:\\Users\\Zheng\\Desktop\\ttt.jpg");
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void AgentDetailTest() {
		AgentDetailResponse response = SDK.AgentDetail(AGENT_ID);

		assertNotNull(response);
	}

	@Test
	@Ignore
	public void SaleHouseInputRequestBuilderTest() {
		SaleHouseInputRequestBuilder builder = new SaleHouseInputRequestBuilder();

		SaleHouseInputRequest request = builder.withHouseType(OpenApiConstants.HOUSE_TYPE_LEASE).withRoom(10).build();

		assertTrue(request.getHouseType().equals(OpenApiConstants.HOUSE_TYPE_LEASE));
		assertTrue(request.getRoom() == 10);
	}
}
