package com.test.spring;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/11/13 15:36
 */
public class PersonImpl implements Person {
	private String name;
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String say() {
		if (null == name) {
			name = "zhangsan";
		}
		return "hello " + name;
	}
}
