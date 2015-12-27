package com.calc.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculationPageObject {

	@AndroidFindBy(id="com.android2.calculator3:id/cling_dismiss")
	public MobileElement clickDismiss;	
	
	@AndroidFindBy(id="com.android2.calculator3:id/digit2")
	public MobileElement clickTwo;
	
	@AndroidFindBy(id="com.android2.calculator3:id/plus")
	public MobileElement clickPlus;
	
	@AndroidFindBy(id="com.android2.calculator3:id/digit9")
	public MobileElement clickNine;
	
	@AndroidFindBy(id="com.android2.calculator3:id/equal")
	public MobileElement clickEqual;
	
	@AndroidFindBy(id="com.android2.calculator3:id/div")
	public MobileElement clickDivide;
	
	@AndroidFindBy(id="com.android2.calculator3:id/minus")
	public MobileElement clickMinus;
	
	@AndroidFindBy(id="com.android2.calculator3:id/mul")
    public MobileElement clickMultiply;	
}
