package com.paralle.tests;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DivideTest extends UserBaseTest{

	@Test
    public void divideTest() throws Exception  {
	
		System.out.println("ThreadName: " + Thread.currentThread().getName() + Thread.currentThread().getStackTrace()[1].getClassName());
		waitForElement(By.id("com.android2.calculator3:id/cling_dismiss"), 30);
		//WebElement el= getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss"));
		//highlightElement(getDriver(), el);
		getDriver().findElement(By.id("com.android2.calculator3:id/cling_dismiss")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit5")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/div")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/digit9")).click();
		getDriver().findElement(By.id("com.android2.calculator3:id/equal")).click();
//		//getDriver().close();
    }
}
