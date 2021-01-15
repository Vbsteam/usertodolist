package com.example.mytodolist;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class Simple extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        // for only offline database and also done changes in newtaskactivity

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
