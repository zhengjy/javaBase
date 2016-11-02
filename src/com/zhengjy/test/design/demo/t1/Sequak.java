package com.zhengjy.test.design.demo.t1;

public class Sequak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("尖叫的鸭子");
	}

}
