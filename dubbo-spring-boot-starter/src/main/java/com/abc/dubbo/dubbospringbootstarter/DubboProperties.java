package com.abc.dubbo.dubbospringbootstarter;

import com.alibaba.dubbo.config.RegistryConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.dubbo")
public class DubboProperties{
    
    private String application;
	private RegistryConfig registry;


	/**
	 * @return the application
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * @return the registry
	 */
	public RegistryConfig getRegistry() {
		return registry;
	}

	/**
	 * @param registry the registry to set
	 */
	public void setRegistry(RegistryConfig registry) {
		this.registry = registry;
	}

	/**
	 * @param application the application to set
	 */
	public void setApplication(String application) {
		this.application = application;
	}

}