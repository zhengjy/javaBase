package com.zhengjy.test.design.futrue.t2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Test {
	public static void main(String[] args) throws Exception {
		//构造FutureTask
		FutureTask<String> future = new FutureTask<String>(new RealData("a"));
		ExecutorService executor = Executors.newFixedThreadPool(1);
		//执行FutureTask，	
		executor.submit(future);
		System.out.println("执行完毕");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(future.get());
	}
}
