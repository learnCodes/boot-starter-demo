package com.abc.dubbo.dubbospringbootstarter;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = { java.lang.annotation.ElementType.TYPE })
@Documented
@Import({ DemoAutoConfiguratin.class })
@Configuration
public @interface EnableDemo {
    String demoName() default "";
}