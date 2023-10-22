package com.app.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTestPri1 {
	
	@Test
	public void username() {
		System.out.println("username");
	}

	@Test
	public void password() {
		System.out.println("password");
	}

	
	@Test(enabled=false)
	public void click() {
		System.out.println("click");
	}
	
	@Ignore
	@Test
	public void username1() {
		System.out.println("username1");
	}

	@Test
	public void password1() {
		System.out.println("password1");
	}

	
	@Test
	public void click1() {
		System.out.println("click1");
	}


}
