package com.liuyang19900520.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/09
 */
@Component
public class AppBeanPostFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition indexDao = beanFactory.getBeanDefinition("indexDao");
		indexDao.setScope("prototype");
		System.out.println("test test test ");
	}
}
