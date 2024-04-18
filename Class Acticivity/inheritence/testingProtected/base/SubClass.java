package com.inheritence.testingProtected.base;

public class SubClass extends SuperClass{
	protected void accessProtected() {
		protectedField=5;
		protectedMethod();
	}
}
