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
		//定义一个builder，定义为我们需要的这个dao的类型
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ImportBeanDefinitionRegistrarDao.class);
		//获取这个BeanDefinition
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanDefinitionBuilder.getBeanDefinition();

		//我们需要为这个BeanDefinition的构造方法上，添加一个参数，
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(ImportBeanDefinitionRegistrarDao.class);
		beanDefinition.setBeanClass(ImportBeanDefinitionRegistrarFactoryBean.class);
		registry.registerBeanDefinition("liuyang", beanDefinition);

	}
}
