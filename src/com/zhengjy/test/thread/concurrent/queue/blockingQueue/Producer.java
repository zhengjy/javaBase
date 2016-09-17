package com.zhengjy.test.thread.concurrent.queue.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	protected BlockingQueue<String> blockingQueue;
	
	public Producer(BlockingQueue<String> blockingQueue){
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		try {
			blockingQueue.put("1");
			Thread.sleep(1000);
			blockingQueue.put("2");
			Thread.sleep(1000);
			blockingQueue.put("3");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
