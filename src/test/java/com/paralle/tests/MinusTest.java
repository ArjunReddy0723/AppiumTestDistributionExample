package com.paralle.tests;



import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.appium.manager.BaseTest;

public class MinusTest extends BaseTest{

	@Test
    public void minusTest() throws Exception  {
	
		System.out.println("ThreadName: " + Thread.currentThread().getName() + Thread.currentThread().getStackTrace()[1].getClassName());
		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
		//WebElement el= driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss"));
		//highlightElement(driver, el);
		driver.findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit5")).click();
		driver.findElement(By.id("com.android2.calculator3:id/plus")).click();
		driver.findElement(By.id("com.android2.calculator3:id/digit9")).click();
		driver.findElement(By.id("com.android2.calculator3:id/equal")).click();
//		//driver.close();
    }
}
