package com.calc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.appium.manager.AppiumParallelTest;
import com.calc.objects.CalculationPageObject;
import com.paralle.tests.UserBaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculationPage{

	private CalculationPageObject calculationPageObject = new CalculationPageObject();

	public CalculationPage(AppiumDriver<MobileElement> driver) {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(UserBaseTest.getDriver(), 10, TimeUnit.SECONDS), calculationPageObject);
	}

	public CalculationPage acceptPopUp(AppiumDriver<MobileElement> driver) {
		//waitForElement(calculationPageObject.clickDismiss, 30);
		calculationPageObject.clickDismiss.click();
		return new CalculationPage(driver);
	}

	public CalculationPage clickNine(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickNine.click();
		return new CalculationPage(driver);
	}

	public CalculationPage plus(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickPlus.click();
		return new CalculationPage(driver);
	}

	public CalculationPage clickTwo(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickTwo.click();
		return new CalculationPage(driver);
	}

	public CalculationPage clickEqual(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickEqual.click();
		return new CalculationPage(driver);
	}

	public CalculationPage clickDivide(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickDivide.click();
		return new CalculationPage(driver);
	}

	public CalculationPage clickMinus(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickMinus.click();
		return new CalculationPage(driver);
	}
	
	public CalculationPage clickMultiply(AppiumDriver<MobileElement> driver) {
		calculationPageObject.clickMultiply.click();
		return new CalculationPage(driver);
	}

}
