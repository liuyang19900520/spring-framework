package com.liuyang19900520.spring.config;

import com.liuyang19900520.spring.beanDefinitionRegistar.TestImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/03
 */
@Configuration
@Import(TestImportBeanDefinitionRegistrar.class)
public class AppConfig {
}
