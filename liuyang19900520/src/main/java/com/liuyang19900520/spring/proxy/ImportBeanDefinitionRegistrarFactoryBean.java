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

	/**
	 * 传递一个class类型，通过这个传递过来的类型，来实现这个多态性。
	 * 使得这个FactoryBean能够对应多个接口，或者说能够创建出多个接口对应的对象的代理对象
	 * 这时候getObject传出的就是得到代理对象
	 *
	 * @param c
	 */
	public ImportBeanDefinitionRegistrarFactoryBean(Class<?> c) {
		this.clazz = c;
	}

	@Override
	public Object getObject() throws Exception {
		//创建代理对象
		Class<?>[] classes = new Class<?>[]{clazz};
		Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(), classes, new ImportBeanDefinitionRegistrarInvocationHandler());
		return o;
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
