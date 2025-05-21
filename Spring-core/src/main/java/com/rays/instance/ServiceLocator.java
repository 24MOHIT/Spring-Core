package com.rays.instance;

public class ServiceLocator {
	
	private static ServiceLocator instance;
	
	private ServiceLocator() {
		System.out.println("method1");
	}
	
	public static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
			System.out.println("method");
		}
		
		return instance;
	}

}
