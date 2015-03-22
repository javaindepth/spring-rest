package com.javaindepth.springrest.model;

import java.io.Serializable;

public class Greeting implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int count;
	private String context;
	
	public Greeting(int count,String context) {
		this.count=count;
		this.context=context;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	

}
