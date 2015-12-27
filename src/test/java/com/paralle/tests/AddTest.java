package com.paralle.tests;

import org.testng.annotations.Test;

import com.calc.pages.CalculationPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddTest extends UserBaseTest {

	public static AppiumDriver<MobileElement> driver;
	static CalculationPage calculationPage;

	@Test
	public static void addTest() throws Exception {

		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		calculationPage = new CalculationPage(driver);
		calculationPage.acceptPopUp(driver).clickTwo(driver).plus(driver).clickNine(driver).clickEqual(driver);

	}

	@Test
	public static void addTest_1() throws Exception {
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		calculationPage = new CalculationPage(driver);
		calculationPage.acceptPopUp(driver).clickTwo(driver).plus(driver).clickNine(driver).clickEqual(driver);
	}

	@Test
	public static void addTest_2() throws Exception {
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		calculationPage = new CalculationPage(driver);
		calculationPage.acceptPopUp(driver).clickTwo(driver).plus(driver).clickNine(driver).clickEqual(driver);
	}
}
