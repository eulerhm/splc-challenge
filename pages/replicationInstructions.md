### Replication instructions

## Requisites:

1) Android SDK installed with the proper SDK versions according to the application demand. 
ANDROID_HOME [environment variable](https://developer.android.com/studio/command-line/variables) must be configured.

2) Java SDK 14. The instrumentation was tested with [Oracle Java](https://www.oracle.com/java/technologies/downloads/). JAVA_HOME environment
variable must be set.

3) Gradle tool (gradlew). This can be installed on Ubuntu Linux from the Terminal (sudo apt install gradle)

4) [Python 3.6](https://docs.python-guide.org/starting/install3/linux/) (minimum tested version). 

5) A rooted smartphone with Android 10. 

i. The simple way is using [Magisk](https://magiskmanager.com/). [Detailed instructions](https://droidfeats.com/how-to-install-magisk/) 
    
ii. [Xposed framework](https://droidfeats.com/install-xposed-framework-on-android-10/)  

6) [Sensor Disable app](https://apkpure.com/br/xposed-sensor-disabler/com.mrchandler.disableprox) version 3.0.2 

7) [Sensor Disable Xposed module](https://github.com/wardellbagby/sensor-disabler)

8) Each instrumented test class must be extended with the [instrumentation](https://github.com/eulerhm/samplingapptest/tree/master/TestInstrumentation)


## Test suite execution [script](https://github.com/eulerhm/samplingapptest/blob/master/Scripts/runExpAll-MultiExec.py):

1) Set the desired setting file name (line 8)

2) Set the output folder for test reports (lines 12, 46, 92 e 95)

2) Check the application verification task (line 83) by the command "gradlew tasks". The 
common instrumented testing task of applications with standard flavors (debug, release etc) 
is connectedDebugAndroidTest.

4) Run the script (python3 runExpAll-MultExec.py)

5) Check the output folder with the test reports in HTML format.
