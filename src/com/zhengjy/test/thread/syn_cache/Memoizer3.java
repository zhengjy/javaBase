package com.zhengjy.test.thread.syn_cache;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Memoizer3<A,V> implements Computable<A, V> {
private final Map<A,Future<V>> cache = new ConcurrentHashMap<A, Future<V>>();
	
	private final Computable<A, V> c;
	
	public Memoizer3(Computable<A, V> c){
		this.c = c;
	}
	
	@Override
	public V compute(final A arg) {
		Future<V> future = cache.get(arg);
		if(future==null){
			Callable<V> call = new Callable<V>() {
				public V call(){
					return c.compute(arg);
				}
			};
			FutureTask<V> ft = new FutureTask<V>(call);
			future = ft;
			cache.put(arg, ft);
			ft.run();
		}
		
		try {
			return future.get();
		} catch (InterruptedException | ExecutionException e) {
			return null;
		}
	}
	
}
