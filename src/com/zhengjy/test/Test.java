package com.zhengjy.test;


public class Test {
	public static void main(String[] args) {
		Long l1 = 2228L;
		Long l2 = 228L;
		System.out.println(l1.equals(l2));
		
		Thread.setDefaultUncaughtExceptionHandler(null);
	}
}
