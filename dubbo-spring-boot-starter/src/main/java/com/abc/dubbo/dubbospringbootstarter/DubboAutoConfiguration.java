package com.abc.dubbo.dubbospringbootstarter;

import com.abc.dubbo.dubbospringbootstarter.entities.DemoEntity;
import com.alibaba.dubbo.config.RegistryConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DubboProperties.class)
class DubboAutoConfiguratin{
    @Autowired
    private DubboProperties properties;
    
    /*
     Auto create a bean when initialize. 
     */
    @Bean
    @ConditionalOnMissingBean
    public DemoEntity initDemoEntity() {
        DemoEntity demo = new DemoEntity();
        demo.setMessage(properties.getApplication());
        return demo;
    }

    @Bean                                                                                                                                   
    @ConditionalOnMissingBean(RegistryConfig.class)                                                                                           
    public RegistryConfig setRegistryConfig() {                                                                                                    
        return properties.getRegistry();                                                                                                                
    }  
}