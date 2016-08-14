package com.zhengjy.test.io.pipedInputStream;

public class PipedInputStreamTest {
	boolean closedByWriter =false;
	
	volatile boolean closedByReader =false;
	
	boolean connected = false;
	
	Thread readSide;
	Thread writeSide;
	byte[] buffer;
	int out =0,in=-1;
	
	
	public int read(){
		readSide = Thread.currentThread();
		while(in <0){
			notifyAll();
			try {
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int ret = buffer[out++] & 0xFF;
		if(out >= buffer.length){
			out = 0;
		}
		if(in == out){
			in = -1;
		}
		return ret;
	}
}
