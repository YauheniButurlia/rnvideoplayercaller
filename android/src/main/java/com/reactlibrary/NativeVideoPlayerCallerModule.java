package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class NativeVideoPlayerCallerModule extends ReactContextBaseJavaModule {

    public final int VIDEO_CODE = 1;
    private final ReactApplicationContext reactContext;

    public NativeVideoPlayerCallerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "NativeVideoPlayerCaller";
    }

    @ReactMethod
    public void showVideoPlayer(String url) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent videoIntent = new Intent(Intent.ACTION_VIEW);
            videoIntent.setDataAndType(Uri.parse(url), "video/*");
            currentActivity.startActivityForResult(videoIntent, VIDEO_CODE);
        }
    }

    @Override
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        if (requestCode == VIDEO_CODE) {
            getCurrentActivity().finish();
        }
    }
}
