package com.example.mytodolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ExtraActivity extends AppCompatActivity {

    private Button button4, button5;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        button4= findViewById(R.id.button4);
        button5= findViewById(R.id.button5);
        firebaseAuth = FirebaseAuth.getInstance();

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(ExtraActivity.this, LoginActivity.class));
                }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ExtraActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}