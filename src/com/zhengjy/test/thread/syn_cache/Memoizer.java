package com.zhengjy.test.thread.syn_cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Memoizer<A,V> implements Computable<A, V>{
	private final ConcurrentHashMap<A,Future<V>> cache = new ConcurrentHashMap<A, Future<V>>();
	private final Computable<A, V> c;
	public Memoizer(Computable<A, V> c){
		this.c = c;
	}
	
	
	@Override
	public V compute(final A arg) {
		while(true){
			Future<V> f= cache.get(arg);
			if(f ==null){
				Callable<V> eval = new Callable<V>() {

					@Override
					public V call() throws Exception {
						return c.compute(arg);
					}
				};
				FutureTask<V> ft =new FutureTask<V>(eval);
				f= cache.putIfAbsent(arg, ft);
				if(f ==null){
					f = ft;
					ft.run();
				}
			}
			try {
				f.get();
			} catch (InterruptedException | ExecutionException e) {
				cache.remove(arg,f);
				e.printStackTrace();
			}
		}
	}

}
