package com.paralle.tests;

import org.testng.annotations.Test;

import com.appium.manager.ParallelThread;

public class Runner {

//	public static void main(String[] args) throws Exception {
//		
//	}
	
	@Test
	public void testRunner() throws Exception{
		ParallelThread parallelThread = new ParallelThread();
		parallelThread.runner("com.paralle.tests");
	}
}
