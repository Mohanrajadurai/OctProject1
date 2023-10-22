package com.app.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.support.FindBy;

import com.app.unit.SampleOne;
import com.app.unit.SampleTwo;

@RunWith(Suite.class)
@SuiteClasses({SampleOne.class,SampleTwo.class})
public class Runner {
	

	
}
