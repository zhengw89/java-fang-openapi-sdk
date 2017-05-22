package com.fang.agent.openapi.util;

/**
 * �ַ���������
 */
public final class StringUtil {

	/**
	 * ��֤�ַ����Ƿ�Ϊ��
	 *
	 * @param s �ַ���ֵ
	 * @return �Ƿ�Ϊ��
	 */
	public static boolean isNullOrEmpty(final String s) {
		return s == null || s.trim().isEmpty();
	}
	
	/**
	 * �ַ����޳�ָ����β
	 *
	 * @param str �ַ���
	 * @param suffix ��β
	 * @return �ַ���
	 */
	public static String trimEnd(String str, String suffix){
		if (str.endsWith(suffix)) {
			return str.substring(0, str.length() - suffix.length());
		}
		return str;
	}
	
	/**
	 * �ַ����޳�ָ����ͷ
	 *
	 * @param str �ַ���
	 * @param suffix ��ͷ
	 * @return �ַ���
	 */
	public static String trimStart(String str, String suffix) {
		if(str.startsWith(suffix)){
			return str.substring(suffix.length(),str.length());
		}
		return str;
	}
}
