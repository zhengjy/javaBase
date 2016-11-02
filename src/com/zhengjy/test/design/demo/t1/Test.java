package com.zhengjy.test.design.demo.t1;

public class Test {
	public static void main(String[] args) {
		FlyBehavior flyBehavior = new FlyWithWings();
		QuackBehavior  quackBehavior = new MuteQuack();
		Duck duck = new MallardDuck(flyBehavior,quackBehavior);
		duck.performFly();
		duck.performQuack();
	}
}
