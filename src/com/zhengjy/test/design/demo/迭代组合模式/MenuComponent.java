package com.zhengjy.test.design.demo.迭代组合模式;

public abstract class MenuComponent {
	public void add(MenuComponent component){
		throw new UnsupportedOperationException();
	}
}
