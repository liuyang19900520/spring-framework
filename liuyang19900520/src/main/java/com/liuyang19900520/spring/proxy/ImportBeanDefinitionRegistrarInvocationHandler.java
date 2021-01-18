package com.liuyang19900520.spring.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/16
 */
public class ImportBeanDefinitionRegistrarInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
		System.out.println("================ImportBeanDefinitionRegistrarInvocationHandler");
		return null;
	}
}
