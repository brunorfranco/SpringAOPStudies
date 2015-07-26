package com.bruno.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public * com.bruno.model.*.get*(..))")
	public void loggingAdvice(){
		System.out.println("Advice run. Get Method");
	}
	
	@Before("calculateDiameter()")
	public void loggingAdviceForDiameter(){
		System.out.println("Calculate Diameter Advice");
	}
	
	@Pointcut("execution(public * com.bruno.model.Circle.calculateDiameter(..))")
	public void calculateDiameter(){}

}
