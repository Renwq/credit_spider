package com.rwq.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rwq.plate.CreditCheckView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spider(View view) {
        Intent spider = new Intent(this, SpiderActivity.class);
        startActivity(spider);
    }

    public void credit(View view) {
        Intent credit = new Intent(this, CreditActivity.class);
        startActivity(credit);
    }
}
