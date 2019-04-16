package com.example.wagubibrian.finager_mobile_android;

import android.app.Application;

import com.example.wagubibrian.finager_mobile_android.domain.di.Component.DaggerSignInComponent;
import com.example.wagubibrian.finager_mobile_android.domain.di.Component.SignInComponent;
import com.example.wagubibrian.finager_mobile_android.domain.di.Modules.AppModule;
import com.example.wagubibrian.finager_mobile_android.domain.di.Modules.GoogleSignInModule;

public class MyApplication extends Application {
    private SignInComponent signInComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        signInComponent = DaggerSignInComponent.builder()
                .appModule(new AppModule(this))
                .googleSignInModule(new GoogleSignInModule())
                .build();
    }

    public SignInComponent getNetComponent(){
        return signInComponent;
    }


}
