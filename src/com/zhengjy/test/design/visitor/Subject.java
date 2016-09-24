package com.zhengjy.test.design.visitor;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
