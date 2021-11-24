package com.archieves;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String os() default "windows";

	int version() default 1;
}

@SmartPhone
class NokiaSeries {
	

}

public class CustomAnnotation {

	public static void main(String[] args) {
          
		NokiaSeries obj=new NokiaSeries();
		
		Class c=obj.getClass();
		SmartPhone s=(SmartPhone) c.getAnnotation(SmartPhone.class);
		
		System.out.println(s.os());
	}

}
