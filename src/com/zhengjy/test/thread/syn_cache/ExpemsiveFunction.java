package com.zhengjy.test.thread.syn_cache;

import java.math.BigInteger;

public class ExpemsiveFunction implements Computable<String,BigInteger>{
	
	public BigInteger compute(String arg){
		//在经过很长时间的计算后
		return new BigInteger(arg);
	}
	
}
