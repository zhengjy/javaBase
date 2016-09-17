package com.zhengjy.test.thread.concurrent.queue.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
protected BlockingQueue<String> blockingQueue;
	
	public Consumer(BlockingQueue<String> blockingQueue){
		this.blockingQueue = blockingQueue;
	}
	@Override
	public void run() {
		try {
			System.out.println(blockingQueue.take());
			System.out.println(blockingQueue.take());  
			System.out.println(blockingQueue.take());  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
