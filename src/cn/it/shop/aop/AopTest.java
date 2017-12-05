package cn.it.shop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopTest {

	@Pointcut("execution(* cn.it.shop.service.*.*(..))")
	public void pointCut(){};
	
	@Around("pointCut()")
	public void doAround(ProceedingJoinPoint jp){
		try {
			System.out.print("doAround start");
			jp.proceed();
			System.out.print("do Around end");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("do Around error");
		}
	}
}
