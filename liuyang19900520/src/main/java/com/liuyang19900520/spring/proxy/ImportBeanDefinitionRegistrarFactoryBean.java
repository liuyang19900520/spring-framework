package com.liuyang19900520.spring.proxy;

import com.liuyang19900520.spring.dao.ImportBeanDefinitionRegistrarDao;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/16
 */
public class ImportBeanDefinitionRegistrarFactoryBean implements FactoryBean<Object> {

	Class<?> clazz;

	public ImportBeanDefinitionRegistrarFactoryBean(Class<?> c) {
		this.clazz = c;
	}

	@Override
	public Object getObject() throws Exception {
		Class<?>[] classes = new Class<?>[]{clazz};
		Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), classes, new ImportBeanDefinitionRegistrarInvocationHandler());
		return o;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
