## SPLC Challenge Cases

The dataset includes 20 mobile applications. These applications are from different categories named according to the Play Store categories, with a large variation of size and test code size. For instance, applications vary from 455 lines of code (MoonShot) to more than 347,000 lines of code (WordPress-Android). Similarly, test code size vary between 464 lines of code (MoonShot) and 3,732 (Mixin-Messenger). Moreover, the number of test cases vary from 4 (Ground) to 164 (AnkiDroid). The number of commits vary between 21 (Threema) to 68,148 (WordPress-Android).

|Name 	        |Category  | LOC|	Test LOC	|Test Cases|Resources|	Commits	  |
|-------        |-------|---------|---------|-------|--------|-------                   |
|[AnkiDroid](pages/ankidroid.md)             |Education |158,607       |2,770   |164  |	Camera, Mobile Data, Wi-Fi      |13,643      |
|[CovidNow](pages/covidnow.md)             |Medical |2,269       |540   |21  |	Mobile Data, Wi-Fi      |85      |
|[Ground](pages/ground.md)             |Productivity |19,906      |525   |4  |	Camera, Location, Mobile Data, Wi-Fi      |4,936     |
|[Iosched](pages/iosched.md)             |Books, Reference |27,824       |473   |9  |	Location, Mobile Data, Wi-Fi       |3,101      |
|[Lockwise](pages/lockwise.md)             |Productivity |14,535       |1,184   |38  |	Mobile Data, Wi-Fi     |503      |
|[Mixin-Messenger](pages/mixin.md)             |Finance |168,080       |3,732   |160  |	Bluetooth, Camera, Location, Mobile Data, Wi-Fi     |8,086      |
|[Moonshot](pages/moonshot.md)             |Tools |455       |464   |28  |	Mobile Data, Wi-Fi    |351     |
|[Nekome](pages/nekome.md)             |Productivity |1,084       |2,097   |64  |	Mobile Data, Wi-Fi     |2,742      |
|[Nl-covid19](pages/nlcovid19.md)             |Medical |65,839       |1,114   |20  |	Bluetooth, Mobile Data, Wi-Fi     |1,293      |
|[Openscale](pages/openscale.md)             |Health, Fitness |27,781       |1,451   |14  |	Bluetooth, Location     |2,027      |
|[OwnTracks](pages/owntracks.md)             |Travel, Local |14,499       |889   |27  |	Location, Mobile Data, Wi-Fi     |1,995      |
|[PocketHub](pages/pockethub.md)             |Productivity |29,001       |1,663   |107  |	Mobile Data, Wi-Fi     |3,512      |
|[RadioDroid](pages/radiodroid.md)             |Music, Audio |22,815       |1,735   |23  |	Bluetooth, Mobile Data, Wi-Fi    |1,186      |
|[Scarlet-Notes](pages/scarletnotes.md)             |Productivity |4,260       |770   |52  |	Mobile Data, Wi-Fi    |656      |
|[Showly-2.0](pages/showly2.md)             |Entertainment |2,547       |952   |55  |	Mobile Data , Wi-Fi     |3,251     |
|[SpaceXFollower](pages/spacexfollower.md)             |News, Magazines |7,664       |940   |30  |	Mobile Data, Wi-Fi      |356      |
|[Threema](pages/threema.md)             |Communication |238,045       |1,931   |54  | Bluetooth, Camera, Location, Mobile Data, Wi-Fi    |21      |
|[Vocable](pages/vocable.md)             |Communication |13,188       |499   |14  | Camera     |863      |
|[WooCommerce](pages/woocommerce.md)             |Business |156,962       |1,367   |27  | Mobile Data, Wi-Fi     |26,527      |
|[WordPress-Android](pages/wordpress.md)             |Productivity |347,897       |3,674   |115  | Camera, Mobile Data, Wi-Fi     |68,148      |



### Some notes


1 - Settings: 

The [settings](https://github.com/eulerhm/samplingapptest/tree/master/Settings) were defined for five testing strategies (Random, One-Disabled, One-Enabled, Most-Enabled-Disabled, and Pairwise) 

2 - Build scripts and the Manifest files: 

The gradle build scripts and the Android Manifest files were adapted to our instrumentation, for instance, to include suitable API dependencies and to allow control permissions (such as for accessing Wi-Fi state). Each application has the test classes of androidTest folder extended with our instrumentation.

3 - Test suite instrumentation:

Our [instrumentation](https://github.com/eulerhm/samplingapptest/tree/master/TestInstrumentation) was implemented for Java and Kotlin. There are particularities according to the screen device, since we use the [UI Automator testing framework](https://developer.android.com/training/testing/other-components/ui-automator).

4 - Test execution: 

Requirements: A device running Android 10. This device must be rooted in order to install [Sensor Disabler app](https://play.google.com/store/apps/details?id=com.mrchandler.disableprox&hl=en&gl=US) to manage the sensors. Also, the [Lens Cap app](https://play.google.com/store/apps/details?id=com.ownzordage.chrx.lenscap&hl=en_IN&gl=US) must be installed to allow camera control.
The host machine must have Python 3 installed and the Android SDK and the Java SDK environment system variables properly set.

The Python [script](Scripts) *runExpAll-MultiExec* must be executed according to the proper gradle verification task, often *connectedDebugAndroidTest*, for installing and running Android instrumented tests on the connected device.

5 - Test analysis: 

All test reports are available in [TestResults](https://github.com/eulerhm/samplingapptest/tree/master/TestResults). 


There are [deitaled instructions for replicability](pages/replicationInstructions.md).

### Contact

- [Euler Marinho](http://labsoft.dcc.ufmg.br/doku.php?id=people:students:euler_marinho): eulerhm at dcc dot ufmg dot br 
- [Fischer Ferreira](http://labsoft.dcc.ufmg.br/doku.php?id=people:students:fischer_ferreira): fischerjf at dcc dot ufmg dot br
- [Joao P. Diniz](http://labsoft.dcc.ufmg.br/doku.php?id=people:students:joao_diniz): jpaulo at dcc dot ufmg dot br
- [Eduardo Figueiredo](http://www.dcc.ufmg.br/~figueiredo)
