package com.liuyang19900520.spring.config;

import com.liuyang19900520.spring.beanDefinitionRegistar.TestImportBeanDefinitionRegistrar;
import com.liuyang19900520.spring.dao.Index2Dao;
import org.springframework.context.annotation.*;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/03
 */
@Configuration
@EnableAspectJAutoProxy
@EnableMBeanExport
//@Import(TestImportBeanDefinitionRegistrar.class)
public class AppConfig {

	@Bean
	public Index2Dao getIndex2Dao() {
		return new Index2Dao();
	}
}
