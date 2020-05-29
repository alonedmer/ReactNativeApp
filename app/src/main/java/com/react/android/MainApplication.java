package com.react.android;

import android.app.Application;

import androidx.annotation.Nullable;

import com.facebook.react.BuildConfig;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiawei on 2020/5/20.
 */
public class MainApplication extends Application implements ReactApplication {

    private final ReactNativeHost mReactNativeHost =
            new ReactNativeHost(this) {
                @Override
                public boolean getUseDeveloperSupport() {
                    return BuildConfig.DEBUG;
                }

                @Override
                protected List<ReactPackage> getPackages() {
                    List<ReactPackage> packages = new ArrayList<>();
                    // Packages that cannot be autolinked yet can be added manually here, for example:
                    // packages.add(new MyReactNativePackage());
                    packages.add(new MainReactPackage());
                    return packages;
                }

                @Override
                protected String getJSMainModuleName() {
                    return "index";
                }

                //可以自定义Bundle文件加载路径
                @Nullable
                @Override
                protected String getJSBundleFile() {
                    //String path = getApplicationContext().getCacheDir() + File.separator + "bundles/index.android.bundle";
                    return super.getJSBundleFile();
                }
            };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }
}
