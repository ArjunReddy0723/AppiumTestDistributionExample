package com.paralle.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddTest extends UserBaseTest {

	@Test
	public void addTest() throws Exception {
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
		getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit2")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/plus")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit9")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/equal")).click();
	}
	
	@Test
	public void addTest_1() throws Exception {
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
		getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit22")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/plus")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit9")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/equal")).click();
	}
	
	
	@Test
	public void addTest_2() throws Exception {
		System.out.println("ThreadName: " + Thread.currentThread().getName()
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
		getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit22")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/plus")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit9")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/equal")).click();
	}
}
