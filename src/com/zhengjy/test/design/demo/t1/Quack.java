package com.zhengjy.test.design.demo.t1;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("呱呱叫的鸭子");
	}

}
