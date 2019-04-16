package com.example.wagubibrian.finager_mobile_android.domain.di.Component;

import com.example.wagubibrian.finager_mobile_android.views.Login.LoginActivity;
import com.example.wagubibrian.finager_mobile_android.domain.di.Modules.AppModule;
import com.example.wagubibrian.finager_mobile_android.domain.di.Modules.GoogleSignInModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, GoogleSignInModule.class})
public interface SignInComponent {
    void inject(LoginActivity loginActivity);
}
