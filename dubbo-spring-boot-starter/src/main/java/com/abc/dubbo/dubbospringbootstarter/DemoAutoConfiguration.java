package com.abc.dubbo.dubbospringbootstarter;

import javax.annotation.PostConstruct;

import com.abc.dubbo.dubbospringbootstarter.entities.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DubboProperties.class)
class DemoAutoConfiguratin{
    @Autowired
    private DubboProperties properties;
    @PostConstruct
    public void init() {
       String name = properties.getApplication();
       System.out.println("\r\n!!!!!!DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO！！！\r\n"+
       "***********************   "+name+"   ***********************\r\n"+
       "!!!!!!DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO-DEMO！！！\r\n");
    }
}