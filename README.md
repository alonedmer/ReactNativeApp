# ReactNativeApp
Android React-Native Hybird 

1. under the android studio project execute **npm init**   
2. **npm install --save react react-native**   
3. project root **build.gradle** repositories add   
```
  maven {
    // All of React Native (JS, Android binaries) is installed from npm
    url "$rootDir/node_modules/react-native/android"
  }
  maven {
    // Android JSC is installed from npm  
    url("$rootDir/node_modules/jsc-android/dist")
  }
  maven { url 'https://www.jitpack.io' }
  ```
4. app **build.gradle** repositories add   
```
  project.ext.react = [
    enableHermes: true,  // clean and rebuild if changing . Faster with Hermes JS engine
  ]
  def jscFlavor = 'org.webkit:android-jsc:+'
  def enableHermes = project.ext.react.get("enableHermes", false);
  
  dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    //noinspection GradleDynamicVersion
    implementation 'com.facebook.react:react-native:+' // From node_modules
    if (enableHermes) {
      def hermesPath = "../node_modules/hermes-engine/android/";
      debugImplementation files(hermesPath + "hermes-debug.aar")
      releaseImplementation files(hermesPath + "hermes-release.aar")
    } else {
      implementation jscFlavor
    }
    implementation "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"  //necessary
  }
  ``` 

5. package JS file into bundle file       
   * create a new script file bundle.sh drop to root   
   ```
   react-native bundle --platform android --dev false --entry-file index.js --bundle-output ./app/src/main/assets/index.android.bundle --assets-dest ./app/src/main/res
   ```
   * execute **chmod +x ./bundle.sh**   
   * execute **./bundle.sh**   
