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
		//我们需要为这个BeanDefinition创建对象时的构造方法上，添加一个参数，这个参数类型是我们要传递给FactoryBean的，实现我们一个FactoryBean，能够对应多个接口的需求
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(ImportBeanDefinitionRegistrarDao.class);
		//为BeanDefinition的beanClass设置为我们手写的FactoryBean，这样可以通过getObject方法可到代理对象
		beanDefinition.setBeanClass(ImportBeanDefinitionRegistrarFactoryBean.class);
		//注册到我们的beanMap中
		registry.registerBeanDefinition("liuyang", beanDefinition);
	}
}
