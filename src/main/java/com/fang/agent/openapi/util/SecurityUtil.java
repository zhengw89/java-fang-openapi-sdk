package com.fang.agent.openapi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fang.agent.openapi.util.crypto.CryptUtil;

/**
 * ������֤������
 */
public final class SecurityUtil {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

	/**
	 * ��ȡ����ǩ��
	 *
	 * @param agentId ������ID
	 * @param key API����Key
	 * @return ǩ��
	 */
	public static String getSignature(int agentId, String key) {
		StringBuilder sb = new StringBuilder();
		sb.append(agentId);
		sb.append(key);
		sb.append(DATE_FORMAT.format(new Date()));

		return CryptUtil.Md5Encrypt(sb.toString());
	}
}
