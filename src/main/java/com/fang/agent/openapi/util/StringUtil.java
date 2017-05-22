package com.fang.agent.openapi.util;

/**
 * 字符串工具类
 */
public final class StringUtil {

	/**
	 * 验证字符串是否为空
	 *
	 * @param s 字符串值
	 * @return 是否为空
	 */
	public static boolean isNullOrEmpty(final String s) {
		return s == null || s.trim().isEmpty();
	}
	
	/**
	 * 字符串剔除指定结尾
	 *
	 * @param str 字符串
	 * @param suffix 结尾
	 * @return 字符串
	 */
	public static String trimEnd(String str, String suffix){
		if (str.endsWith(suffix)) {
			return str.substring(0, str.length() - suffix.length());
		}
		return str;
	}
	
	/**
	 * 字符串剔除指定开头
	 *
	 * @param str 字符串
	 * @param suffix 开头
	 * @return 字符串
	 */
	public static String trimStart(String str, String suffix) {
		if(str.startsWith(suffix)){
			return str.substring(suffix.length(),str.length());
		}
		return str;
	}
}
