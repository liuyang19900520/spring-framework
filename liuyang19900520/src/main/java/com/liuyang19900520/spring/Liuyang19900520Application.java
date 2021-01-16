package com.liuyang19900520.spring;

import com.liuyang19900520.spring.config.AppConfig;
import com.liuyang19900520.spring.dao.ImportBeanDefinitionRegistrarDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author Max Liu
 */

public class Liuyang19900520Application {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ImportBeanDefinitionRegistrarDao dao = (ImportBeanDefinitionRegistrarDao) annotationConfigApplicationContext.getBean("liuyang");
		dao.query();
		//		annotationConfigApplicationContext.register();
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new AppBeanPostFactoryProcessor());
//		annotationConfigApplicationContext.refresh();
//		IndexDao dao1 = annotationConfigApplicationContext.getBean(IndexDao.class);
//		IndexDao dao2 = annotationConfigApplicationContext.getBean(IndexDao.class);
//		System.out.println(dao1.hashCode() + "===========" + dao2.hashCode());
	}

}
