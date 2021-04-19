package com.example.android2nd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btndail);
        button2=findViewById(R.id.btnweb);
    }

    public void Dail(View view) {
        Uri uri=Uri.parse("tel:+92300932234");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }

    public void open_web(View view) {
        Uri uri=Uri.parse("http://www.pucit.edu.pk");
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH,uri);
        startActivity(intent);

    }
}