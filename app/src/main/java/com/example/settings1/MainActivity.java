package com.example.settings1;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button btn2 = (Button)findViewById(R.id.button2);
//        Button btn4 = (Button)findViewById(R.id.button4);
//        Button btn5 = (Button)findViewById(R.id.button5);
//        Button btn8 = (Button)findViewById(R.id.button8);
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View n) {
//                startActivity(new Intent(MainActivity.this, Inbox.class));
//            }
//        });
//
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View n) {
//                startActivity(new Intent(MainActivity.this, CustomerService.class));
//            }
//        });
//
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View m) {
//                startActivity(new Intent(MainActivity.this, storeLocator.class));
//            }
//        });
//
//        btn8.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, AppSettings.class));
//            }
//        });



//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow();
//        }
    }

    public void Inbox(View view){
        Intent intent = new Intent (this, Inbox.class);
        startActivity(intent);
    }

    public void StoreLocator(View view){
        Intent intent = new Intent (this, storeLocator.class);
        startActivity(intent);
    }

    public void FollowUs(View view){
        Intent intent = new Intent (this, FollowUs.class);
        startActivity(intent);
    }

    public void GiftCard(View view){
        Intent intent = new Intent (this, GiftCard.class);
        startActivity(intent);
    }

    public void CustomerService(View view){
        Intent intent = new Intent (this, CustomerService.class);
        startActivity(intent);
    }

    public void AppSettings(View view){
        Intent intent = new Intent (this, AppSettings.class);
        startActivity(intent);
    }




//    public void CustomerService(View view) {
//        Intent intent = new Intent (this, CustomerService.class);
//        startActivity(intent);
//    }
//
//    public void StoreLocator(View view){
//        Intent intent = new Intent (this, storeLocator.class);
//        startActivity(intent);
//    }

//    public void GiftCard(View view){
//        Intent intent = new Intent (this, AppSettings.class);
//        startActivity(intent);
//    }
//
//    public void CustomerService(View view){
//        Intent intent = new Intent (this, CustomerService.class);
//        startActivity(intent);
//    }
//
//    public void FollowUs(View view){
//        Intent intent = new Intent (this, AppSettings.class);
//        startActivity(intent);
//    }

}