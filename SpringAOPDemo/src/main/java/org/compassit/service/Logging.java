package org.compassit.service;

import org.aspectj.lang.JoinPoint;
import org.compassit.account.Account;

public class Logging {

	public void logStarts(JoinPoint joinPoint) {
		System.out.println("logStarts()");
		System.out.println("*****************");
		System.out.println(joinPoint);
		System.out.println(joinPoint.getTarget());
		
		Account account=(Account)joinPoint.getTarget();
		System.out.println(account.getEmployee());
		
		
/*		System.out.println(joinPoint.getKind());
		System.out.println(joinPoint.getThis());
		System.out.println(joinPoint.getArgs());
		System.out.println(joinPoint.getSignature());
		System.out.println(joinPoint.getSourceLocation());
		System.out.println(joinPoint.getStaticPart());
		System.out.println(joinPoint.ADVICE_EXECUTION);
		System.out.println(joinPoint.CONSTRUCTOR_CALL);
		System.out.println(joinPoint.EXCEPTION_HANDLER);
		System.out.println(joinPoint.FIELD_GET);
		System.out.println(joinPoint.FIELD_SET);
		System.out.println(joinPoint.INITIALIZATION);
		System.out.println(joinPoint.METHOD_CALL);
		System.out.println(joinPoint.METHOD_EXECUTION);
		System.out.println(joinPoint.PREINITIALIZATION);
		System.out.println(joinPoint.STATICINITIALIZATION);
		System.out.println(joinPoint.SYNCHRONIZATION_LOCK);
		System.out.println("*****************");*/
	}

	public void logEnds() {
		System.out.println("logEnds()");
	}

}
