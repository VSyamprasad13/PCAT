package com.inheritence.testingProtected.test;

import com.inheritence.testingProtected.base.SubClass;

public class Test {
	
	public void accessProtected() {
		SubClass s = new SubClass();
//		s.accessProtected();
//		Error because protected members cannot be accessed outside the package
	}

}
