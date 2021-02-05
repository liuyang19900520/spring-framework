package com.liuyang19900520.spring.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * <p>
 *
 * </p>
 *
 * @author Max Liu
 * @since 2021/01/20
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
