package com.ducat;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class TrackOperation {
	@Pointcut("execution(* com.ducat.Operation.*(..))")
	public void k() {
		
	}// pointcut name

	@Pointcut("execution(* Operation.k*(..))")
	public void ok() {
	}// pointcut name

	@Before("k()") // applying pointcut on before advice
	// @After("k()")//applying pointcut on after advice
	public void myadvice(JoinPoint jp)// it is advice
	{
		System.out.println("additional concern");
		 System.out.println("Method Signature: " + jp.getSignature());
	}
	 @After("k()")
	   public void afterAdvice(){
	      System.out.println("After execution method.");
	   }

	 @After("ok()")
	   public void afterAdvice1(){
	      System.out.println("After execution method k.");
	   }
}
