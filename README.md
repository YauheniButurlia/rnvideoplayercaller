# react-native-native-video-player-caller

## Getting started

`$ npm install react-native-native-video-player-caller --save`

### Mostly automatic installation

`$ react-native link react-native-native-video-player-caller`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-native-video-player-caller` and add `NativeVideoPlayerCaller.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libNativeVideoPlayerCaller.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.NativeVideoPlayerCallerPackage;` to the imports at the top of the file
  - Add `new NativeVideoPlayerCallerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-native-video-player-caller'
  	project(':react-native-native-video-player-caller').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-native-video-player-caller/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-native-video-player-caller')
  	```


## Usage
```javascript
import NativeVideoPlayerCaller from 'react-native-native-video-player-caller';

// TODO: What to do with the module?
NativeVideoPlayerCaller;
```
