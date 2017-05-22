package com.fang.agent.openapi.bean.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 参数标识注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Argument {

	/**
	 * 参数名称属性
	 *
	 * @return 参数名称
	 */
	public String name() default "";
}
