package org.peng.spring.tutorial.test.model;

public class A2 extends NameModel{

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public String toString() {
		return "A [getName()=" + getName() + "]";
	}

	

}
