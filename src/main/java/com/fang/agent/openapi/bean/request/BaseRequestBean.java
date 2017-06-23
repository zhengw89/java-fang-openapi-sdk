package com.fang.agent.openapi.bean.request;

import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fang.agent.openapi.bean.annotation.Argument;
import com.fang.agent.openapi.constants.OpenApiConstants;
import com.fang.agent.openapi.util.StringUtil;

/**
 * 请求对象基类.
 */
public abstract class BaseRequestBean {

	/**
	 * 验证请求对象是否合法.
	 *
	 * @return 对象是否合法
	 */
	public final boolean beanValid() {
		return validateBean();
	}

	/**
	 * 获取请求对象非法信息.
	 *
	 * @return 对象非法信息
	 */
	public final String getBeanInvalidMessage() {
		return beanInvalidMessage();
	}

	/**
	 * 验证请求对象是否合法核心逻辑.
	 *
	 * @return 对象是否合法
	 */
	protected abstract boolean validateBean();

	/**
	 * 获取请求对象非法信息核心逻辑.
	 *
	 * @return 对象非法信息
	 */
	protected abstract String beanInvalidMessage();

	/**
	 * 获取请求参数.
	 *
	 * @return 请求参数
	 */
	public Map<String, String> getRequestArgs() {

		Map<String, String> argMap = new HashMap<String, String>();

		try {
			Class<?> cl = this.getClass();
			List<Field> fields = this.getAllFields(new ArrayList<Field>(), cl);
			for (Field field : fields) {
				Argument argument = field.getAnnotation(Argument.class);
				if (argument != null) {
					field.setAccessible(true);
					Object fieldValue = field.get(this);
					if (fieldValue != null) {
						argMap.put(argument.name(), URLEncoder.encode(fieldValue.toString(), "GBK"));
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			return null;
		}

		return argMap;
	}

	/**
	 * 检查房源类型参数是否合法.
	 *
	 * @param value
	 *            房源类型
	 * @return 房源类型参数是否合法
	 */
	protected boolean checkHouseTypeValueLegal(String value) {
		return OpenApiConstants.checkHouseTypeValueLegal(value);
	}

	/**
	 * 检查物业类型参数是否合法.
	 *
	 * @param value
	 *            物业类型
	 * @return 物业类型参数是否合法
	 */
	protected boolean checkPurposeTypeValueLegal(String value) {
		return OpenApiConstants.checkPurposeTypeValueLegal(value);
	}

	/**
	 * 检查房源图片类型是否合法.
	 *
	 * @param albumType
	 *            房源图片类型
	 * @return 房源图片类型是否合法
	 */
	protected boolean checkHousPhotoAlbumTypeValueLegal(int albumType) {
		return OpenApiConstants.checkHousePhotoAlbumTypeValueLegal(albumType);
	}

	/**
	 * 检查房源状态类型是否合法.
	 *
	 * @param value
	 *            房源状态
	 * @return 房源状态类型是否合法
	 */
	protected boolean checkHouseStatusValueLegal(int value) {
		return OpenApiConstants.checkHouseStatusValueLegal(value);
	}

	/**
	 * 字符串列表转换.
	 *
	 * @param values
	 *            字符串列表
	 * @return 按照逗号分隔合并
	 */
	protected final String convertToStrWithCommaFromStrings(List<String> values) {
		if (values == null || values.isEmpty())
			return null;

		StringBuilder sb = new StringBuilder();
		for (String value : values) {
			sb.append(value);
			sb.append(',');
		}

		return StringUtil.trimEnd(sb.toString(), ",");
	}

	/**
	 * 整型列表转换.
	 *
	 * @param values
	 *            整型列表
	 * @return 按照逗号分隔合并
	 */
	protected final String convertToStrWithCommaFromIntegers(List<Integer> values) {
		if (values == null || values.isEmpty())
			return null;

		StringBuilder sb = new StringBuilder();
		for (Integer value : values) {
			sb.append(String.valueOf(value));
			sb.append(',');
		}

		return StringUtil.trimEnd(sb.toString(), ",");
	}

	/**
	 * 获取参数非法提示信息.
	 *
	 * @param argName
	 *            参数名称
	 * @param argValue
	 *            参数值
	 * @return 提示信息
	 */
	protected final String argInvalidErrorMessage(String argName, int argValue) {
		return this.argInvalidErrorMessage(argName, String.valueOf(argValue));
	}

	/**
	 * 获取参数非法提示信息.
	 *
	 * @param argName
	 *            参数名称
	 * @param argValue
	 *            参数值
	 * @return 提示信息
	 */
	protected final String argInvalidErrorMessage(String argName, String argValue) {
		if (StringUtil.isNullOrEmpty(argValue))
			return argNullErrorMessage(argName);
		return String.format("参数 %s 值非法：%s", argName, argValue);
	}

	/**
	 * 获取参数空提示信息.
	 *
	 * @param argName
	 *            参数名称
	 * @return 提示信息
	 */
	protected final String argNullErrorMessage(String argName) {
		return String.format("参数 %s 为空", argName);
	}

	/**
	 * 反射获取Object所有属性
	 *
	 * @param fields
	 *            属性列表容器
	 * @param type
	 *            Object类型
	 * @return the 属性列表
	 */
	private List<Field> getAllFields(List<Field> fields, Class<?> type) {
		fields.addAll(Arrays.asList(type.getDeclaredFields()));

		if (type.getSuperclass() != null) {
			fields = getAllFields(fields, type.getSuperclass());
		}

		return fields;
	}
}
