package com.example.wagubibrian.finager_mobile_android.domain.di.Modules;

import android.app.Application;

import com.example.wagubibrian.finager_mobile_android.R;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class GoogleSignInModule {

    public GoogleSignInModule(){

    }


    @Provides
    @Singleton
    GoogleSignInOptions provideGoogleSignInOptions(Application application){
         return new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(application.getResources().getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
    }

    @Provides
    @Singleton
    GoogleSignInClient provideGoogleSignInClient(Application application, GoogleSignInOptions googleSignInOptions){
        return GoogleSignIn.getClient(application, googleSignInOptions);

    }

    @Provides
    @Singleton
    FirebaseAuth provideFirebaseAuth(){
        return FirebaseAuth.getInstance();
    }
}
