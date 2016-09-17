package com.zhengjy.test.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableTest {
	public static void main(String[] args) throws Exception, ExecutionException {
		Callable<String> call2= new Callable<String>() {

			@Override
			public String call() throws Exception {
				return null;
			}
		};
		
		
		final ExecutorService exec = Executors.newFixedThreadPool(1);  
        Callable<String> call = new Callable<String>() {
            public String call() throws Exception {
    				return null;
            }
        };  
        try {
            Future<String> future = exec.submit(call);  
            String obj = future.get(1000 *3, TimeUnit.MILLISECONDS); //任务处理超时时间设为 1 秒  
        } catch (TimeoutException ex) {
        }finally {
        	// 关闭线程池  
        	exec.shutdown();  
		}
		
	}
}
