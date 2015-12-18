# AppiumTestDistributionExample

Connect n+1 android devices and trigger the below command.

Run Test
```
  * RUNNER="distribute" APP_PATH="/Users/saikrisv/Documents/workspace/TestNGParallel/build/AndroidCalculator.apk" APP_PACKAGE="com.android2.calculator3" APP_ACTIVITY="com.android2.calculator3.Calculator" mvn clean -Dtest=Runner test
  
```
* Please make sure you give the absolute path of the apk
* RUNNER can be set with parallel and distribute.

Once the test run is completed, HTML report will b generated at root directory
