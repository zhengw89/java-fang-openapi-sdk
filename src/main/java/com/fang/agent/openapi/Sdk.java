package com.fang.agent.openapi;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fang.agent.openapi.bean.request.BaseRequestBean;
import com.fang.agent.openapi.bean.request.agent.AgentDetailRequest;
import com.fang.agent.openapi.bean.request.agent.AgentPortInfoRequest;
import com.fang.agent.openapi.bean.request.house.BaseInputRequest;
import com.fang.agent.openapi.bean.request.house.BaseUpdateRequest;
import com.fang.agent.openapi.bean.request.house.HouseDeleteRequest;
import com.fang.agent.openapi.bean.request.house.HouseDetailRequest;
import com.fang.agent.openapi.bean.request.house.HouseListRequest;
import com.fang.agent.openapi.bean.request.house.HousePhotoAddRequest;
import com.fang.agent.openapi.bean.request.house.HousePhotoDelRequest;
import com.fang.agent.openapi.bean.request.house.HousePhotosRequest;
import com.fang.agent.openapi.bean.request.house.HouseRefreshRequest;
import com.fang.agent.openapi.bean.request.house.HouseReleaseRequest;
import com.fang.agent.openapi.bean.request.house.HouseTitlePhotoModifyRequest;
import com.fang.agent.openapi.bean.request.house.HouseUnreleaseRequest;
import com.fang.agent.openapi.bean.response.agent.AgentDetailResponse;
import com.fang.agent.openapi.bean.response.agent.AgentPortInfoResponse;
import com.fang.agent.openapi.bean.response.house.HouseDeleteResponse;
import com.fang.agent.openapi.bean.response.house.HouseDetailResponse;
import com.fang.agent.openapi.bean.response.house.HouseInputResponse;
import com.fang.agent.openapi.bean.response.house.HouseListResponse;
import com.fang.agent.openapi.bean.response.house.HousePhotoAddReponse;
import com.fang.agent.openapi.bean.response.house.HousePhotoDelReponse;
import com.fang.agent.openapi.bean.response.house.HousePhotosResponse;
import com.fang.agent.openapi.bean.response.house.HouseRefreshResponse;
import com.fang.agent.openapi.bean.response.house.HouseReleaseResponse;
import com.fang.agent.openapi.bean.response.house.HouseTitlePhotoModifyResponse;
import com.fang.agent.openapi.bean.response.house.HouseUnreleaseResponse;
import com.fang.agent.openapi.bean.response.house.HouseUpdateReponse;
import com.fang.agent.openapi.util.SecurityUtil;
import com.fang.agent.openapi.util.StringUtil;
import com.fang.agent.openapi.util.crypto.CryptUtil;
import com.fang.agent.openapi.util.http.MultipartUtility;
import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class Sdk {

	private static final String UTF8_CHARSET = "UTF-8";
	private static final String DATA_TYPE_VALUE = "json";
	private static final String USERNAME_ARG_NAME = "userName";
	private static final String PASSWORD_ARG_NAME = "pwd";
	private static final String AGENTID_ARG_NAME = "agentId";
	private static final String COMPANYID_ARG_NAME = "companyId";
	private static final String DATATYPE_ARG_NAME = "dataType";
	private static final String SIG_ARG_NAME = "signature";

	private static final String UPLOAD_IMG_URL_TEMPLATE = "http://img1u.soufun.com/upload/agents/houseinfo/o?channel=centanet&city=&isflash=y&agentId=%d&companyId=%s&signature=%s";

	private static final String AGENT_AUTH = "/Agent/UserAuthentication";

	private static final String HOUSE_INPUT = "/House/Input";
	private static final String HOUSE_UPDATE = "/House/Update";
	private static final String HOUSE_DELETE = "/House/Delete";
	private static final String HOUSE_RELEASE = "/House/ RealeaseHouse";
	private static final String HOUSE_REFRESH_RESOURCE = "/House/RefreshHouse";

	private static final String HOUSE_LIST_RESOURCE = "/House/List";
	private static final String HOUSE_DETAIL = "/House/Detail";

	private static final String HOUSE_PHOTOS = "/House/HousePhotoList";
	private static final String HOUSE_PHOTO_ADD = "/House/HousePhotoAdd";
	private static final String HOUSE_PHOTO_DEL = "/House/HousePhotoDelete";
	private static final String HOUSE_TITLE_PHOTO_MOD = "/House/HouseTitlePictureModify";

	private static final String AGENT_DETAIL_RESOURCE = "/Agent/Detail";
	private static final String AGENT_PORT_INFO_RESOURCE = "/Agent/PortInfo";

	private final boolean debug;
	private final String host, companyId, key;
	private static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

	public Sdk(String host, String companyId, String key) {
		this(host, companyId, key, false);
	}

	public Sdk(String host, String companyId, String key, boolean debug) {
		this.debug = debug;
		this.host = host;
		this.companyId = companyId;
		this.key = key;
	}

	/**
	 * 经纪人身份验证
	 */
	public String AgentAuthentication(String userName, String password) throws Exception {
		String pwd = null;
		if (this.key.length() >= 8) {
			pwd = CryptUtil.EncryptDES(password, this.key.toLowerCase().substring(0, 8));
		} else {
			pwd = CryptUtil.EncryptDES(password, (this.key.toLowerCase() + "00000000").substring(0, 8));
		}

		Map<String, String> params = new HashMap<String, String>();
		params.put(USERNAME_ARG_NAME, URLEncoder.encode(userName, "UTF-8"));
		params.put(PASSWORD_ARG_NAME, URLEncoder.encode(pwd, "UTF-8"));
		params.put(COMPANYID_ARG_NAME, this.companyId);

		String url = HttpRequest.append(this.getUrl(AGENT_AUTH), params);
		if (this.debug) {
			System.out.println(url);
		}
		HttpRequest request = HttpRequest.get(url);

		return request.body();
	}

	/**
	 * 创建房源
	 */
	public HouseInputResponse HouseInput(int agentId, BaseInputRequest request) {
		return this.requestTemplate(agentId, HOUSE_INPUT, HttpRequest.METHOD_POST, request, HouseInputResponse.class);
	}

	/**
	 * 更新房源
	 */
	public HouseUpdateReponse HouseUpdate(int agentId, BaseUpdateRequest request) {
		return this.requestTemplate(agentId, HOUSE_UPDATE, HttpRequest.METHOD_POST, request, HouseUpdateReponse.class);
	}

	/**
	 * 删除房源
	 */
	public HouseDeleteResponse HouseDelete(int agentId, HouseDeleteRequest request) {
		return this.requestTemplate(agentId, HOUSE_DELETE, HttpRequest.METHOD_POST, request, HouseDeleteResponse.class);
	}

	/**
	 * 发布房源
	 */
	public HouseReleaseResponse HouseRelease(int agentId, HouseReleaseRequest request) {
		return this.requestTemplate(agentId, HOUSE_RELEASE, HttpRequest.METHOD_POST, request, HouseReleaseResponse.class);
	}

	/**
	 * 取消发布房源
	 */
	public HouseUnreleaseResponse HouseUnrelease(int agentId, HouseUnreleaseRequest request) {
		return this.requestTemplate(agentId, HOUSE_RELEASE, HttpRequest.METHOD_POST, request, HouseUnreleaseResponse.class);
	}

	/**
	 * 刷新房源
	 */
	public HouseRefreshResponse HouseRefresh(int agentId, HouseRefreshRequest request) {
		return this.requestTemplate(agentId, HOUSE_REFRESH_RESOURCE, HttpRequest.METHOD_POST, request, HouseRefreshResponse.class);
	}

	/**
	 * 获取房源列表
	 */
	public HouseListResponse HouseList(int agentId, HouseListRequest request) {
		return this.requestTemplate(agentId, HOUSE_LIST_RESOURCE, HttpRequest.METHOD_GET, request, HouseListResponse.class);
	}

	/**
	 * 获取房源详情
	 */
	public HouseDetailResponse HouseDetail(int agentId, HouseDetailRequest request) {
		return this.requestTemplate(agentId, HOUSE_DETAIL, HttpRequest.METHOD_GET, request, HouseDetailResponse.class);
	}

	/**
	 * 获取房源图片列表
	 */
	public HousePhotosResponse HousePhotos(int agentId, HousePhotosRequest request) {
		return this.requestTemplate(agentId, HOUSE_PHOTOS, HttpRequest.METHOD_GET, request, HousePhotosResponse.class);
	}

	/**
	 * 添加房源图片
	 */
	public HousePhotoAddReponse HousePhotoAdd(int agentId, HousePhotoAddRequest request) {
		return this.requestTemplate(agentId, HOUSE_PHOTO_ADD, HttpRequest.METHOD_POST, request, HousePhotoAddReponse.class);
	}

	/**
	 * 删除房源图片
	 */
	public HousePhotoDelReponse HousePhotoDel(int agentId, HousePhotoDelRequest request) {
		return this.requestTemplate(agentId, HOUSE_PHOTO_DEL, HttpRequest.METHOD_POST, request, HousePhotoDelReponse.class);
	}

	/**
	 * 修改房源标题图
	 */
	public HouseTitlePhotoModifyResponse HouseTitlePhotoModify(int agentId, HouseTitlePhotoModifyRequest request) {
		return this.requestTemplate(agentId, HOUSE_TITLE_PHOTO_MOD, HttpRequest.METHOD_POST, request, HouseTitlePhotoModifyResponse.class);
	}

	/**
	 * 上传图片文件
	 */
	public String UploadImg(int agentId, String filePath) throws IOException {

		String url = String.format(UPLOAD_IMG_URL_TEMPLATE, agentId, this.companyId, SecurityUtil.getSignature(agentId, key));

		MultipartUtility multipart = new MultipartUtility(url, UTF8_CHARSET);
		File uploadFile = new File(filePath);
		multipart.addFilePart("fileUpload", uploadFile);

		List<String> response = multipart.finish();
		if (response == null)
			return null;

		StringBuilder sb = new StringBuilder();
		for (String line : response) {
			sb.append(line);
		}

		return sb.toString();
	}

	/**
	 * 获取经纪人详情
	 */
	public AgentDetailResponse AgentDetail(int agentId) {
		return this.requestTemplate(agentId, AGENT_DETAIL_RESOURCE, HttpRequest.METHOD_GET, new AgentDetailRequest(), AgentDetailResponse.class);
	}

	/**
	 * 获取经纪人端口使用情况
	 */
	public AgentPortInfoResponse AgentPortInfo(int agentId, AgentPortInfoRequest request) {
		return this.requestTemplate(agentId, AGENT_PORT_INFO_RESOURCE, HttpRequest.METHOD_GET, request, AgentPortInfoResponse.class);
	}

	private HttpRequest buildHttpPostRequest(int agentId, String url, BaseRequestBean requestBean) throws UnsupportedEncodingException {

		String requestUrl = HttpRequest.append(url, this.getBaseParamsMap(agentId));
		HttpRequest request = HttpRequest.post(requestUrl);
		request.form(requestBean.getRequestArgs());
		return request;
	}

	private HttpRequest buildHttpGetRequest(int agentId, String url, BaseRequestBean requestBean) throws UnsupportedEncodingException {

		Map<String, String> baseParams = this.getBaseParamsMap(agentId);

		baseParams.putAll(requestBean.getRequestArgs());
		String requestUrl = HttpRequest.append(url, baseParams);
		return HttpRequest.get(requestUrl);
	}

	private <T> T requestTemplate(int agentId, String resource, String requestMethod, BaseRequestBean requestBean, Class<T> responseClass) {
		if (!requestBean.beanValid()) {
			throw new RuntimeException(String.format("请求参数错误：%s", requestBean.getBeanInvalidMessage()));
		}

		String baseUrl = this.getUrl(resource);

		HttpRequest request = null;
		try {
			switch (requestMethod) {
			case HttpRequest.METHOD_GET:
				request = this.buildHttpGetRequest(agentId, baseUrl, requestBean);
				break;
			case HttpRequest.METHOD_POST:
				request = this.buildHttpPostRequest(agentId, baseUrl, requestBean);
				break;
			default:
				throw new RuntimeException("HTTP请求类型错误");
			}
		} catch (Exception ex) {
			throw new RuntimeException("HTTP请求对象构造错误：" + ex.getMessage());
		}

		if (this.debug) {
			System.out.println(request.url());
		}

		String responseJson = request.body();
		if (this.debug) {
			System.out.println(responseJson);
		}

		return GSON.fromJson(responseJson, responseClass);
	}

	private String getUrl(String resource) {
		StringBuilder urlSb = new StringBuilder();
		urlSb.append(StringUtil.trimEnd(host, "/"));
		urlSb.append('/');
		urlSb.append(StringUtil.trimStart(resource, "/"));

		return urlSb.toString();
	}

	private Map<String, String> getBaseParamsMap(int agentId) throws UnsupportedEncodingException {
		Map<String, String> params = new HashMap<String, String>();
		params.put(AGENTID_ARG_NAME, String.valueOf(agentId));
		params.put(COMPANYID_ARG_NAME, companyId);
		params.put(DATATYPE_ARG_NAME, DATA_TYPE_VALUE);
		params.put(SIG_ARG_NAME, URLEncoder.encode(SecurityUtil.getSignature(agentId, key), "UTF-8"));

		return params;
	}

}
