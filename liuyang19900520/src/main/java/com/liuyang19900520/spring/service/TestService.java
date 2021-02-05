package com.liuyang19900520.spring.service;

import com.liuyang19900520.spring.dao.ImportBeanDefinitionRegistrarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/20
 */

public class TestService {

	@Autowired
	@Qualifier("liuyang")
	ImportBeanDefinitionRegistrarDao dao;

	public void test() {
		if (dao != null) {
			dao.query();
			System.out.println("ok");
		}
	}
}
