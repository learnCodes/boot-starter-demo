package com.abc.dubbo.dubbospringbootstarter.entities;

public class DemoEntity{
    private String message;
    public void sayHello(){
        System.out.println(message);
    }
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}