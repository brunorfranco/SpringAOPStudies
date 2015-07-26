package com.bruno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bruno.model.Circle;
import com.bruno.service.ShapeService;

public class AopMain {

	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		
		System.out.println(shapeService.getCircle().getName());
		
		System.out.println(shapeService.getTriangle().getName());
		
		Circle circle = shapeService.getCircle();
		circle.calculateDiameter(4);
	}

}
