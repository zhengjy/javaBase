package com.zhengjy.test.design.observer.t5;

import java.util.Observable;

public class Observer1 implements ObServer{

	@Override
	public void update() {
		System.out.println("Observer1 update()");
		
	}

}
