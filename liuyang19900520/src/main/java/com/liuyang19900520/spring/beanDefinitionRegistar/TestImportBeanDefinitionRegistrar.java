package com.liuyang19900520.spring.beanDefinitionRegistar;

import com.liuyang19900520.spring.Liuyang19900520Application;
import com.liuyang19900520.spring.dao.ImportBeanDefinitionRegistrarDao;
import com.liuyang19900520.spring.proxy.ImportBeanDefinitionRegistrarFactoryBean;
import com.liuyang19900520.spring.proxy.ImportBeanDefinitionRegistrarInvocationHandler;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.Proxy;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/16
 */
public class TestImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ImportBeanDefinitionRegistrarDao.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.liuyang19900520.spring.dao.ImportBeanDefinitionRegistrarDao");
		beanDefinition.setBeanClass(ImportBeanDefinitionRegistrarFactoryBean.class);
		registry.registerBeanDefinition("liuyang", beanDefinition);
	}
}
