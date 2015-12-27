package com.paralle.tests;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.appium.manager.AppiumParallelTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UserBaseTest extends AppiumParallelTest{

	public static AppiumDriver<MobileElement> driver;
	
	
	@BeforeMethod()
	public void startApp(Method method) throws Exception {
     driver= startAppiumServerInParallel(method.getName());
	}
	
	@AfterMethod()
	public void killServer(ITestResult result){
      killAppiumServer(result);		
	}
	

	public static AppiumDriver<MobileElement> getDriver(){
		return driver;
	}

}
