package com.liuyang19900520.spring.processor;

import com.liuyang19900520.spring.Liuyang19900520Application;
import com.liuyang19900520.spring.dao.ImportBeanDefinitionRegistrarDao;
import com.liuyang19900520.spring.proxy.ImportBeanDefinitionRegistrarInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.cglib.proxy.Proxy;
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
public class AppBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {


		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ImportBeanDefinitionRegistrarDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();

	}
}
