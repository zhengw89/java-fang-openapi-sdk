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
 * ����������.
 */
public abstract class BaseRequestBean {

	/**
	 * ��֤��������Ƿ�Ϸ�.
	 *
	 * @return �����Ƿ�Ϸ�
	 */
	public final boolean beanValid() {
		return validateBean();
	}

	/**
	 * ��ȡ�������Ƿ���Ϣ.
	 *
	 * @return ����Ƿ���Ϣ
	 */
	public final String getBeanInvalidMessage() {
		return beanInvalidMessage();
	}

	/**
	 * ��֤��������Ƿ�Ϸ������߼�.
	 *
	 * @return �����Ƿ�Ϸ�
	 */
	protected abstract boolean validateBean();

	/**
	 * ��ȡ�������Ƿ���Ϣ�����߼�.
	 *
	 * @return ����Ƿ���Ϣ
	 */
	protected abstract String beanInvalidMessage();

	/**
	 * ��ȡ�������.
	 *
	 * @return �������
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
	 * ��鷿Դ���Ͳ����Ƿ�Ϸ�.
	 *
	 * @param value
	 *            ��Դ����
	 * @return ��Դ���Ͳ����Ƿ�Ϸ�
	 */
	protected boolean checkHouseTypeValueLegal(String value) {
		return OpenApiConstants.checkHouseTypeValueLegal(value);
	}

	/**
	 * �����ҵ���Ͳ����Ƿ�Ϸ�.
	 *
	 * @param value
	 *            ��ҵ����
	 * @return ��ҵ���Ͳ����Ƿ�Ϸ�
	 */
	protected boolean checkPurposeTypeValueLegal(String value) {
		return OpenApiConstants.checkPurposeTypeValueLegal(value);
	}

	/**
	 * ��鷿ԴͼƬ�����Ƿ�Ϸ�.
	 *
	 * @param albumType
	 *            ��ԴͼƬ����
	 * @return ��ԴͼƬ�����Ƿ�Ϸ�
	 */
	protected boolean checkHousPhotoAlbumTypeValueLegal(int albumType) {
		return OpenApiConstants.checkHousePhotoAlbumTypeValueLegal(albumType);
	}

	/**
	 * ��鷿Դ״̬�����Ƿ�Ϸ�.
	 *
	 * @param value
	 *            ��Դ״̬
	 * @return ��Դ״̬�����Ƿ�Ϸ�
	 */
	protected boolean checkHouseStatusValueLegal(int value) {
		return OpenApiConstants.checkHouseStatusValueLegal(value);
	}

	/**
	 * �ַ����б�ת��.
	 *
	 * @param values
	 *            �ַ����б�
	 * @return ���ն��ŷָ��ϲ�
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
	 * �����б�ת��.
	 *
	 * @param values
	 *            �����б�
	 * @return ���ն��ŷָ��ϲ�
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
	 * ��ȡ�����Ƿ���ʾ��Ϣ.
	 *
	 * @param argName
	 *            ��������
	 * @param argValue
	 *            ����ֵ
	 * @return ��ʾ��Ϣ
	 */
	protected final String argInvalidErrorMessage(String argName, int argValue) {
		return this.argInvalidErrorMessage(argName, String.valueOf(argValue));
	}

	/**
	 * ��ȡ�����Ƿ���ʾ��Ϣ.
	 *
	 * @param argName
	 *            ��������
	 * @param argValue
	 *            ����ֵ
	 * @return ��ʾ��Ϣ
	 */
	protected final String argInvalidErrorMessage(String argName, String argValue) {
		if (StringUtil.isNullOrEmpty(argValue))
			return argNullErrorMessage(argName);
		return String.format("���� %s ֵ�Ƿ���%s", argName, argValue);
	}

	/**
	 * ��ȡ��������ʾ��Ϣ.
	 *
	 * @param argName
	 *            ��������
	 * @return ��ʾ��Ϣ
	 */
	protected final String argNullErrorMessage(String argName) {
		return String.format("���� %s Ϊ��", argName);
	}

	/**
	 * �����ȡObject��������
	 *
	 * @param fields
	 *            �����б�����
	 * @param type
	 *            Object����
	 * @return the �����б�
	 */
	private List<Field> getAllFields(List<Field> fields, Class<?> type) {
		fields.addAll(Arrays.asList(type.getDeclaredFields()));

		if (type.getSuperclass() != null) {
			fields = getAllFields(fields, type.getSuperclass());
		}

		return fields;
	}
}
