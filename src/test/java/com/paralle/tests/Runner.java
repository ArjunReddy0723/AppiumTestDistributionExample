package com.paralle.tests;

import com.appium.manager.ParallelThread;

public class Runner {

	public static void main(String[] args) throws Exception {
		ParallelThread parallelThread = new ParallelThread();
		parallelThread.runner("com.paralle.tests");
	}
}
