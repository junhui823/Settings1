package com.example.settings1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FollowUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_us);
    }

    public void Facebook (View view) {
        goToUrl ();
    }

    private void goToUrl() {
        Uri uriUrl = Uri.parse("https://www.facebook.com/hmmalaysia");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void Instagram (View view) {
        goToUrl1 ();
    }

    private void goToUrl1() {
        Uri uriUrl = Uri.parse("https://www.instagram.com/hm/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void Twitter (View view) {
        goToUrl3 ();
    }

    private void goToUrl3() {
        Uri uriUrl = Uri.parse("https://twitter.com/?lang=en");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void Youtube (View view) {
        goToUrl2 ();
    }

    private void goToUrl2() {
        Uri uriUrl = Uri.parse("https://www.youtube.com/user/hennesandmauritz");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}