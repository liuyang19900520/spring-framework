package com.liuyang19900520.spring;

import com.liuyang19900520.spring.config.AppConfig;
import com.liuyang19900520.spring.processor.AppBeanDefinitionRegistryPostProcessor;
import com.liuyang19900520.spring.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Max Liu
 */

public class Liuyang19900520Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new AppBeanDefinitionRegistryPostProcessor());
//		annotationConfigApplicationContext.register(TestService.class);
//		annotationConfigApplicationContext.refresh();
//		TestService bean = annotationConfigApplicationContext.getBean(TestService.class);
//		bean.test();
	}

}
