package com.zhengjy.test.design.demo.t1;

public class MallardDuck extends Duck{
	public MallardDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
		super(flyBehavior,quackBehavior);
	}
	
	@Override
	void display() {
		System.out.println("MallardDuck display");
	}

}
