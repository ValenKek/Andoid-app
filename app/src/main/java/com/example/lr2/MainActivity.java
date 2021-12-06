package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  public void onBtnShowListClick(View view){
        Intent intent=new Intent(this, CompanyListActivity.class);
        startActivity(intent);
    }
}