package com.paralle.tests;

import org.testng.annotations.Test;

import com.appium.manager.ParallelThread;

public class Runner {

	@Test
	public void testApp() throws Exception {
		ParallelThread parallelThread = new ParallelThread();
		parallelThread.runner("com.paralle.tests");

	}
}
