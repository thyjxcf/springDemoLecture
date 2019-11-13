package com.test.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/11/13 15:38
 */
public class SpringTest {

	public static void main(String[] args) {

		ClassPathResource resource = new ClassPathResource("bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		Person person = (Person) factory.getBean("person");
		System.out.println(person.say());
	}
}
