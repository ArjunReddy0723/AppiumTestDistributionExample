package com.paralle.tests;

import org.testng.annotations.Test;

import com.calc.pages.CalculationPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MultiplyTest extends UserBaseTest {

	public static AppiumDriver<MobileElement> driver;
	
	public static CalculationPage calculationPage;


	@Test
	public static void multiplyTest() throws Exception {
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		calculationPage = new CalculationPage(driver);
		calculationPage.acceptPopUp(driver).clickNine(driver).clickMultiply(driver).clickTwo(driver).clickEqual(driver);
	}
}
