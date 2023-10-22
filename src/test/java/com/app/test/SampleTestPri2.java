package com.app.test;

import org.testng.annotations.Test;

public class SampleTestPri2 {
	
	@Test(priority=1)
	public void username11() {
		System.out.println("username11");
	}

	@Test(priority=2)
	public void password11() {
		System.out.println("password11");
	}

	
	@Test(priority=3)
	public void click11() {
		System.out.println("click11");
	}


}
