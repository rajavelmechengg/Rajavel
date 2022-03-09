package com.AllTestNG_Functions;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform_ClassLevel implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(MyRetry_MethodLevel.class);
		
	}
	
	

}
