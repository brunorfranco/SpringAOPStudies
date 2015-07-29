package com.bruno.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("args(name)")
	public void loggingBeforeAdvice(String name){
		System.out.println("Before Advice run. Get Method " + name);
	}
	
	@After("args(name)")
	public void loggingAfterAdvice(String name){
		System.out.println("After Advice run. Get Method " + name);
	}
	
	@AfterReturning(pointcut="execution(public * com.bruno.model.*.getName(..))", returning="nameReturn")
	public void loggingAfterReturnAdvice(String nameReturn){
		System.out.println("After Return Advice run. Get Method " + nameReturn);
	}
	
	@Around("execution(public * com.bruno.model.*.testAroundAspect(..))")
	public void loggingAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("After Return Advice run. Get Method " + nameReturn);
		Object returnValue = null;
		System.out.println("Before Around Advice!");
		returnValue = pjp.proceed();
		System.out.println("After Around Advice!");
		System.out.println("Around Advice return value:" + returnValue);
	}
	
	@Before("calculateDiameter()")
	public void loggingAdviceForDiameter(){
		System.out.println("Calculate Diameter Advice");
	}
	
	@Pointcut("execution(public * com.bruno.model.Circle.calculateDiameter(..))")
	public void calculateDiameter(){}

	@Before("args(myString,..)")
	public void loggingAdviceTwoParams(String myString){
		System.out.println("Inside aspect " + myString);
	}
}
