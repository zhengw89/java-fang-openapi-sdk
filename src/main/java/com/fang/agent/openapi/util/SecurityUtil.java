package com.fang.agent.openapi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fang.agent.openapi.util.crypto.CryptUtil;

/**
 * 请求验证工具类
 */
public final class SecurityUtil {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

	/**
	 * 获取请求签名
	 *
	 * @param agentId 经纪人ID
	 * @param key API分配Key
	 * @return 签名
	 */
	public static String getSignature(int agentId, String key) {
		StringBuilder sb = new StringBuilder();
		sb.append(agentId);
		sb.append(key);
		sb.append(DATE_FORMAT.format(new Date()));

		return CryptUtil.Md5Encrypt(sb.toString());
	}
}
